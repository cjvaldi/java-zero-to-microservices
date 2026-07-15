package org.cjvaldi.javafx.app.javafxapp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.cjvaldi.javafx.app.javafxapp.models.Product;
import org.cjvaldi.javafx.app.javafxapp.services.ProductService;
import org.cjvaldi.javafx.app.javafxapp.services.ProductServiceWebClient;

import java.awt.*;
import java.io.IOException;

public class HelloApplication extends Application {

    private final ProductService service = new ProductServiceWebClient();

    private final ObservableList<Product> products = FXCollections.observableArrayList(
            new Product("Teclado", "Alguna descrip....", 1000L),
            new Product("Mouse", "Alguna descrip....", 500L),
            new Product("CPU", "Alguna descrip....", 2000L),
            new Product("Memoria RAM", "Alguna descrip....", 800L),
            new Product("Monitor", "Alguna descrip....", 1500L)
    );

    private Product productSelected;

    private final TextField nameField = new TextField();
    private final TextField descField = new TextField();
    private final TextField priceField = new TextField();

    private final Button addButton = new Button("Agregar");


    @Override
    public void start(Stage stage) throws IOException {
        TableView<Product> tableView = new TableView<>();

        TableColumn<Product, String> nameColumn = new TableColumn<>("Nombre");
        TableColumn<Product, String> descColumn = new TableColumn<>("Descripción");
        TableColumn<Product, Long> priceColumn = new TableColumn<>("Precio");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        descColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<Product, Void> deleteColumn = new TableColumn<>("Eliminar");
        deleteColumn.setCellFactory(param -> new TableCell<>() {
            private final Button deleteButton = new Button("Eliminar");

            {
                deleteButton.setOnAction(event -> {
                    Product product = (Product) getTableView().getItems().get(getIndex());
                    service.delete(product);
                    tableView.getItems().remove(product);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(deleteButton);
                }
            }
        });
        TableColumn<Product, Void> editColumn = new TableColumn<>("Editar");
        editColumn.setCellFactory(param -> new TableCell<>() {
            private final Button editButton = new Button("Editar");

            {
                editButton.setOnAction(event -> {
                    productSelected = getTableView().getItems().get(getIndex());
                    nameField.setText(productSelected.getName());
                    descField.setText(productSelected.getDescription());
                    priceField.setText(String.valueOf(productSelected.getPrice()));
                    addButton.setText("Editar");
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(editButton);
                }
            }
        });
        tableView.getColumns().addAll(nameColumn, descColumn, priceColumn, deleteColumn, editColumn);
        //tableView.setItems(products);
        tableView.setItems(FXCollections.observableArrayList(service.findAll()));

        nameField.setPromptText("Nombre");
        descField.setPromptText("Descripción");
        priceField.setPromptText("Precio");

        addButton.setOnAction(event -> {
            String name = nameField.getText();
            String description = descField.getText();
            String priceText = priceField.getText();

            if (!name.isBlank() && !description.isBlank() && !priceText.isBlank()) {
                try {
                    Long price = Long.parseLong(priceText);
                    if (productSelected == null) {
                        Product product = new Product(name, description, price);
                        Product createdProduct = service.save(product);
                        tableView.getItems().add(createdProduct);
                    } else {
                        productSelected.setName(name);
                        productSelected.setDescription(description);
                        productSelected.setPrice(price);
                        service.update(productSelected);
                        tableView.refresh();
                        productSelected = null;
                        addButton.setText("Agregar");
                    }
                    nameField.clear();
                    descField.clear();
                    priceField.clear();

                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR, "El precio debe ser un dígito válido!");
                    alert.show();
                }

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Por favor completar todos los campos!");
                alert.show();
            }
        });
        Button clearButton = new Button("Limpiar");
        clearButton.setOnAction(event -> {
            productSelected = null;
            addButton.setText("Agregar");
            nameField.clear();
            descField.clear();
            priceField.clear();
        });
        HBox formBox = new HBox(10, nameField, descField, priceField, addButton, clearButton);
        formBox.setPadding(new Insets(10, 10, 10, 10));
        VBox vbox = new VBox(formBox, tableView);
        Scene scene = new Scene(vbox, 640, 400);
        stage.setTitle("Gestion de Productos!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
