module org.cjvaldi.javafx.app.javafxapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.base;
    requires spring.webflux;
    requires reactor.core;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;


    opens org.cjvaldi.javafx.app.javafxapp to javafx.base;
    opens org.cjvaldi.javafx.app.javafxapp.models to javafx.base, com.fasterxml.jackson.databind;
    exports org.cjvaldi.javafx.app.javafxapp;
}