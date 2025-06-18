import java.util.List;

public class Restaurante {

    private String nome;

    private String cnpj;

    private String nomeFantasia;

    private Endereco endereco;

    private List<Mesa> mesas;

    private List<Menu> menus;

    public Restaurante(String nome, String cnpj, String nomeFantasia, Endereco endereco, List<Mesa> mesas,
                       List<Menu> menus) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
        this.mesas = mesas;
        this.menus = menus;
    }

    public List<Menu> getMenus() {

        return this.menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Mesa> getMesas() {
        return this.mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
