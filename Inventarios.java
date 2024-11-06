

public class Inventarios {
    private static Inventarios instancia;

    private Inventarios() {}

    public static Inventarios iniciarInstancia() {
        if (instancia == null) {
            instancia = new Inventarios();
        }
        return instancia;
    }
}
