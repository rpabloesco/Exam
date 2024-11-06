public class Model {
    private Pedido pedido;

    public Model() {
        pedido = new Builder().build();
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void agregarProducto(Producto producto) {

        pedido = new Builder().nuevoProducto(producto).build();
    }
}
