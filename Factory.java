

public class Factory {
    public static Producto crearPedido(String producto, int cantidad, int precioProducto) {
        if(producto.isEmpty()){
            return null;
        } else {
            return new Producto(producto, cantidad, precioProducto);
        }
    }
}
