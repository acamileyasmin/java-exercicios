import java.util.List;

public class Menu {

    private List<Produto> produtos;

    public Menu(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void mostrar() {
        for (Produto produto : this.produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor: " + produto.getValor());
            System.out.println("Desconto: " + produto.getIva());
            System.out.println("---");
        }
    }

}
