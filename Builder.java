import java.util.ArrayList;
import java.util.List;

public class Builder {
    private ArrayList<Producto> productos = new ArrayList<>();
    private int precio;
    private int cantidad;


    public Builder nuevoProducto(Producto producto){
        this.productos.add(producto);
        this.precio = producto.obtenerPrecio();
        this.cantidad = producto.obtenerCantidad();
        return this;
    }

   public Pedido build(){
        Pedido prd = new Pedido(productos, precio, cantidad);
        return prd;
    }
}
