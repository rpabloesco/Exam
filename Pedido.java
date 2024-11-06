import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private ArrayList<Producto> producto;
    private int total;
    private int cantidad;

    protected Pedido(ArrayList<Producto> prodcutos, int total, int cantidad){
        this.producto = prodcutos;
        this.total = total;
        this.cantidad = cantidad;
    }

    public int total(){
        return total;
    }

    public int cantidad(){
        return cantidad;
    }

    public List<Producto> productos(){
        return producto;
    }
}