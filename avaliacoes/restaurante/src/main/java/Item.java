public class Item {

    private Produto produto;

    private int qtd;

    private float valorVenda;

    public Item(Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
        this.valorVenda = produto.getValor() * qtd;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return this.qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getValorVenda() {
        return this.valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
}
