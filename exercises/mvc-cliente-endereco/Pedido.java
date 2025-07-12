import java.util.List;
import java.util.UUID;

public class Pedido {

    private int numPedido;

    private float valorTotal;

    private List<Item> items;

    private NotaFiscal notaFiscal;

    private Cliente cliente;

    private Mesa mesa;

    public Pedido(int numPedido, List<Item> items, Cliente cliente, Mesa mesa) {
        this.numPedido = numPedido;
        this.items = items;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public void encerrar() {
        System.out.println("Pedido encerrado");
    }

    public void pagar() {
        this.notaFiscal = new NotaFiscal();
        this.notaFiscal.setIdentificacao(UUID.randomUUID());
        this.notaFiscal.setEmitente(this.mesa.getRestaurante().getCnpj());
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public NotaFiscal getNotaFiscal() {
        return this.notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getNumPedido() {
        return this.numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public float getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
