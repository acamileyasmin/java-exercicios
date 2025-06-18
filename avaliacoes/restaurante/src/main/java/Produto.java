public class Produto {

    private String nome;

    private float valor;

    private float iva;

    public Produto(String nome, float valor, float iva) {
        this.nome = nome;
        this.valor = valor;
        this.iva = iva;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getIva() {
        return this.iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
}
