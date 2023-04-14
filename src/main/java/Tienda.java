import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> ventas;
    private String mombreT;
    private ArrayList<Producto>productos;
//private Producto productoVendido;



    public Tienda(String mombreT, ArrayList<Producto> productos) {
        this.mombreT = mombreT;
        this.productos=productos;
        this.ventas=new ArrayList<>();
    }

    public String getMombreT() {
        return mombreT;
    }

    public void setMombreT(String mombreT) {
        this.mombreT = mombreT;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void mostrarProductos(){
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Descripción: " + producto.getDescripcion());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Stock: " + producto.getStock());
            System.out.println("Categoría: " + producto.getCategoria());
            System.out.println("------------------------");
        }

    }
    public void buscarProducto(String nombreOCategoria) {


        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreOCategoria) || producto.getCategoria().equals(nombreOCategoria)) {
                producto.imprimirProducto();

            }
        }
    }

    public void modPrecio(String nombre, String categoria, int precioNuevo) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre) && producto.getCategoria().equals(categoria)) {
                producto.setPrecio(precioNuevo);
                producto.imprimirProducto();
                break;
            }
        }

    }
    public void modStock(String nombre, String categoria, int stockNuevo) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre) && producto.getCategoria().equals(categoria)) {
                producto.setStock(stockNuevo);
                producto.imprimirProducto();
                break;
            }
        }

    }

    public void removerProducto(String nombre) {
        String nombreProductoEliminar = nombre;
        Producto productoEliminar = null;
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProductoEliminar)) {
                productoEliminar = producto;
                producto.imprimirProducto();

                break;
            }

        }
        if (productoEliminar != null) {
            productos.remove(productoEliminar);
        }

    }
    public void GenerarVenta(ArrayList<Producto> r){
        System.out.println("Boleta de Productos: ");
        this.ventas=r;
        // Recorremos todos los productos de la lista de ventas
        for (Producto venta : ventas) {
            boolean encontrado = false;
            // Recorremos todos los productos de la lista de productos
            for (Producto producto : productos) {
                // Si el nombre de los productos coincide, disminuimos el stock en el producto correspondiente
                if (venta.getNombre().equals(producto.getNombre())) {
                    System.out.println("Nombre: " + venta.getNombre());
                    System.out.println("Descripción: " + venta.getDescripcion());
                    System.out.println("Precio: " + venta.getPrecio());
                    System.out.println("Stock: " + venta.getStock());
                    System.out.println("Categoría: " + venta.getCategoria());
                    System.out.println("------------------------");
                    producto.setStock(producto.disminuirStock(producto.getStock(),venta.getStock()));

                    encontrado = true;
                    break;
                }
            }
            // Si no se encontró un producto con el mismo nombre, se imprime un mensaje indicando que no hay stock
            if (!encontrado) {
                System.out.println("El artículo " + venta.getNombre() + " no tiene stock.");
            }

        }

    }



}







