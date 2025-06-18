import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private String numero;

    private String local;

    private Funcionario garcom;

    private List<Pedido> pedidos;

    private Restaurante restaurante;

    public Mesa(String numero, String local) {
        this.numero = numero;
        this.local = local;
        this.pedidos = new ArrayList<>();
    }

    public Restaurante getRestaurante() {
        return this.restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Funcionario getGarcom() {
        return this.garcom;
    }

    public void setGarcom(Funcionario garcom) {
        this.garcom = garcom;
    }

    public List<Pedido> getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
