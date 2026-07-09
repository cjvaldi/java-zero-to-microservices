import PropTypes from "prop-types";
import { useEffect, useState } from "react";
import { ProductTable } from "./components/ProductTable";
import { ProductForm } from "./components/ProductForm";
import { findAll, create, remove, update } from "./services/productService";
import Swal from "sweetalert2";

// https://sweetalert2.github.io/
// para las alertas de sweetalert2, se debe instalar la librería con el comando:
// npm install sweetalert2

// Vamos a consumir el productService para obtener los productos
// const initProducts = [
//     {
//         id: 1,
//         name: "Monitor Asus 37 pulgadas",
//         description: "El monitor es perfecto para juegos!",
//         price: 1000,
//     },
//     {
//         id: 2,
//         name: "Teclado Mecánico",
//         description: "Teclado mecánico con switches rojos",
//         price: 150,
//     },
// ];

export const ProductsApp = ({ title = "Title default!" }) => {
    const [products, setProducts] = useState([]);

    const [productSelected, setProductSelected] = useState({
        id: 0,
        name: "",
        description: "",
        price: "",
    });

    const getProducts = async () => {
        const result = await findAll();
        setProducts(result.data);
    };

    useEffect(() => {
        getProducts();
        console.log("Cargando la página de productos...");
    }, []);

    const handleAddProduct = async (product) => {
        if (product.id > 0) {
            const response = await update(product);
            setProducts(
                products.map((prod) => {
                    if (prod.id === product.id) {
                        return { ...response.data };
                    }
                    return prod;
                }),
            );
            Swal.fire({
                title: "Actualizado con éxito!",
                text: `El producto ${product.name} se ha actualizado correctamente.`,
                icon: "success",
            });
        } else {
            const response = await create(product);
            setProducts([...products, { ...response.data }]);
            Swal.fire({
                title: "Creado con éxito!",
                text: `El producto ${product.name} se ha creado correctamente.`,
                icon: "success",
            });
        }
    };

    const handlerProductSelected = (product) => {
        setProductSelected({ ...product });
    };

    const handlertRemoveProduct = (id) => {
        Swal.fire({
            title: "Seguro de Eliminar?",
            text: "Cuidado va a eliminar un producto!",
            icon: "warning",
            showCancelButton: true,
            confirmButtonColor: "#3085d6",
            cancelButtonColor: "#d33",
            confirmButtonText: "Si",
        }).then((result) => {
            if (result.isConfirmed) {
                remove(id);
                setProducts(products.filter((prod) => prod.id !== id));
                Swal.fire({
                    title: "Eliminado con éxito!",
                    text: "Producto eliminado con éxito.",
                    icon: "success",
                });
            }
        });
    };
    return (
        <div className="container my-4">
            <h2>{title}</h2>
            <div className="row">
                <div className="col">
                    <ProductForm
                        handlerAdd={handleAddProduct}
                        productSelected={productSelected}
                    />
                </div>
                <div className="col">
                    {products.length > 0 ? (
                        <ProductTable
                            products={products}
                            handlerProductSelected={handlerProductSelected}
                            handlertRemoveProduct={handlertRemoveProduct}
                        />
                    ) : (
                        <div className="alert alert-warning">
                            No hay productos en el sistema
                        </div>
                    )}
                </div>
            </div>
        </div>
    );
};

ProductsApp.propTypes = {
    title: PropTypes.string.isRequired,
};
