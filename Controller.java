public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void actualizarVista() {
        view.mostrarPedido(model.getPedido());
    }

    public void agregarProducto(String product, int cantidad, int precioProducto) {
        Producto producto = Factory.crearPedido(product, cantidad, precioProducto);
        model.agregarProducto(producto);
        actualizarVista();
    }

}
