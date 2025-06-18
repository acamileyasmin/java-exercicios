public class Funcionario extends Pessoa {

    private String ctp;

    private String cargo;

    public Funcionario(String nome, String numeroCpf, Endereco endereco, String ctp, String cargo) {
        super(nome, numeroCpf, endereco);
        this.ctp = ctp;
        this.cargo = cargo;
    }

    public String getCtp() {
        return this.ctp;
    }

    public void setCtp(String ctp) {
        this.ctp = ctp;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
