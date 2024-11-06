
public class Ordenes {
    private Inventarios invent;
    private Builder build;


    public Ordenes(){
        invent =  Inventarios.iniciarInstancia();
        build = new Builder();
    }

    public void agregarPedido(String product, int cantidad, int precioProducto){
        Producto pedidos = Factory.crearPedido(product, cantidad, precioProducto);
        if(pedidos == null){
            build.nuevoProducto(pedidos);
        }else {
            System.out.println("Error");
        }
    }
}


