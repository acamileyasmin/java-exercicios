public class Endereco {

    private String tipo;

    private String cep;

    private int numero;

    public Endereco(String tipo, String cep, int numero) {
        this.tipo = tipo;
        this.cep = cep;
        this.numero = numero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
