

public class Producto {

    String producto;
    int cantidad;
    int precioProducto;
    String pago;

    public Producto(String producto, int cantidad, int precioProducto) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioProducto = precioProducto;
    }


    public String obtenerProducto() {
        return producto;
    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public int obtenerPrecio() {
        return precioProducto;
    }

    public String obtenerPago() {
        return pago;
    }

    public int precioTotal() {
        return cantidad * precioProducto;
    }

}
