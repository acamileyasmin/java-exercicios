package view;

import controller.MenuController;
import model.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuScan {

    public static void main(String[] args) {
        MenuController menuController = new MenuController();

        Scanner scanner = new Scanner(System.in);

        System.out.println("::Restaurante projeto - Menus::");
        System.out.println("");
        System.out.println("1 - Cadastrar menu");
        System.out.println("2 - Adicionar produto em menu");
        System.out.println("3 - Remover produto em menu");
        System.out.println("4 - Excluir menu");
        System.out.println("5 - Pegar menus");

        System.out.println("");
        System.out.print("-> ");

        int mode = Integer.parseInt(scanner.nextLine());

        if (mode == 1) {
            System.out.println("::Cadastrar menu::");
            System.out.println("");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            menuController.salvar(nome, new ArrayList<>());

            System.out.print("Menu salvo!");
        } else if (mode == 2) {
            System.out.println("::Adicionar produto em menu::");
            System.out.println("");

            System.out.print("Nome do menu: ");
            String nomeDoMenu = scanner.nextLine();

            System.out.print("Nome do produto: ");
            String nomeDoProduto = scanner.nextLine();

            boolean foiRemovido = menuController.adicionarProduto(nomeDoMenu, nomeDoProduto);

            if (foiRemovido) {
                System.out.println("Produto adicionado ao menu!");
            } else {
                System.out.println("Erro! Menu ou produto não existe.");
            }
        } else if (mode == 3) {
            System.out.println("::Remover produto em menu::");
            System.out.println("");

            System.out.print("Nome do menu: ");
            String nomeDoMenu = scanner.nextLine();

            System.out.print("Nome do produto: ");
            String nomeDoProduto = scanner.nextLine();

            boolean foiRemovido = menuController.removerProduto(nomeDoMenu, nomeDoProduto);

            if (foiRemovido) {
                System.out.println("Produto removido do menu!");
            } else {
                System.out.println("Erro! Menu ou produto não existe.");
            }
        } else if (mode == 4) {
            System.out.println("::Remover menu::");
            System.out.println("");

            System.out.print("Nome do menu: ");
            String nomeDoMenu = scanner.nextLine();

            menuController.remover(nomeDoMenu);

            System.out.print("Menu removido!");
        } else if (mode == 5) {
            System.out.println("::Menus::");
            System.out.println();

            for (Menu menu : menuController.pegarTodos()) {
                System.out.println(menu.toString());
            }
        }
    }

}
