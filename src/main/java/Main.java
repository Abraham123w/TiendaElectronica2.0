import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Camisa", "Camisa de algodón", 25000, 10, "Ropa"));
        listaProductos.add(new Producto("Zapatillas", "Zapatillas deportivas", 40000, 5, "Calzado"));
        listaProductos.add(new Producto("Guerra de los mundos", "Libro de ciencia ficción", 15000, 20, "Libros"));
        listaProductos.add(new Producto("Casa de Papel", "Libro para adolecentes", 17000, 7, "Libros"));
        Tienda tienda1;
        // ArrayList<Ventas>venta0=new ArrayList<>();


        tienda1= new Tienda("Electro Ofertas",listaProductos);
        //mostrar productos
        tienda1.mostrarProductos();
        //buscar producto por nombre o categoria
        tienda1.buscarProducto("Ropa");
        //tienda1.buscarProducto("Calzado");
        tienda1.buscarProducto("Libros" );
        //modificar el precio de un producto
        tienda1.modPrecio("Camisa","Ropa",30000);
        tienda1.mostrarProductos();
        //eliminar producto de la tienda por nombre
        tienda1.removerProducto("Casa de Papel");
        tienda1.mostrarProductos();
        //generar venta

        ArrayList<Producto> listaProductosV = new ArrayList<>();
        listaProductosV.add(new Producto("Camisa", "Camisa de algodón", 25000, 1, "Ropa"));
        listaProductosV.add(new Producto("Zapatillas", "Zapatillas deportivas", 40000, 2, "Calzado"));
        listaProductosV.add(new Producto("Guerra de los mundos", "Libro de ciencia ficción", 15000, 3, "Libros"));
        listaProductosV.add(new Producto("Casa de Papel", "Libro para adolecentes", 17000, 1, "Libros"));
        //Ventas venta1;
        //venta1=new Ventas(listaProductosV);
        //tienda1.agregarVenga(venta1);
        tienda1.GenerarVenta(listaProductosV);






    }}

