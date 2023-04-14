import java.util.ArrayList;

public class Producto {

    private String nombre;
    private String descripcion;
    private int precio;
    private  int stock;
    private String categoria;


    public Producto(String nombre, String descripcion, int precio, int stock, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void imprimirProducto() {
        System.out.println("Nombre: " + this.nombre +",Descipcion:"+ this.descripcion+"Precio;"+this.precio+"Stock"+this.stock+ ", Categoría: " + this.categoria);
    }
    public static double sumarValor(ArrayList<Producto> listaProductos) {
        double total = 0;
        for (Producto producto : listaProductos) {
            total += producto.precio;
        }
        return total;
    }
    public int disminuirStock(int stockActual,int venta){

        int nuevoStock=stockActual-venta;
        //System.out.println("El stock actual " + stockActual);
        //  System.out.println("El stock venta: " + venta);
        // System.out.println("El stock del producto es: " + nuevoStock);
        return nuevoStock;


    }
}
