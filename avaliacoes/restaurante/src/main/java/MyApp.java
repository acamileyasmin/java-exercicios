import java.util.ArrayList;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {
        // Produtos
        Produto risoli = new Produto("Risoli de Pernil", 2.90F, 0.23F);
        Produto somersby = new Produto("Somersby Pressão", 5.90F, 0.23F);
        Produto francesinhaTrad = new Produto("Francesinha Tad.", 12.90F, 0.23F);
        Produto francesinhaGued = new Produto("Francesinha Gued.", 5.90F, 0.23F);
        Produto batataFrita = new Produto("1/2 Batata Frita", 2.50F, 0.23F);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(risoli);
        produtos.add(somersby);
        produtos.add(francesinhaTrad);
        produtos.add(francesinhaGued);
        produtos.add(batataFrita);

        Menu menu = new Menu(produtos);
        List<Menu> menus = new ArrayList<>();
        menus.add(menu);


        // Restaurante


        List<Mesa> mesas = new ArrayList<>();
        Mesa terrace = new Mesa("213", "Terrace");
        mesas.add(terrace);

        Endereco restEnd = new Endereco("Rua", "4000-393", 76);
        Restaurante restaurante = new Restaurante("Anvileo Rooftop, Ltda.", "42.143.762/0001-97", "Casa Guedes",
                restEnd, mesas, menus);

        terrace.setRestaurante(restaurante);

        // Situação

        Endereco emEnd = new Endereco("Rua", "11271110", 218);
        Cliente emanuel = new Cliente("Emanuel", "14222976732", emEnd);

        Endereco camEnd = new Endereco("Rua", "11271110", 300);
        Funcionario camille = new Funcionario("Camille", "1985553706", camEnd, "144112313513", "Garçom");

        terrace.setGarcom(camille);

        List<Item> items = new ArrayList<>();
        items.add(new Item(batataFrita, 1));

        Pedido emPed = new Pedido(1, items, emanuel, terrace);
        terrace.getPedidos().add(emPed);

        System.out.println("Processando pedido...");

        emPed.encerrar();
        emPed.pagar();


    }

}
