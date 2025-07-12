package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.MenuController;
import controller.ProdutoController;
import model.Menu;
import model.Produto;

public class ProdutoScan {
    
    public static void main(String[] args) {
        ProdutoController produtoController = new ProdutoController();

        Scanner scanner = new Scanner(System.in);

        System.out.println("::Restaurante projeto - Produtos::");
        System.out.println("");
        System.out.println("1 - Cadastro de produto");
        System.out.println("2 - Deletar produto");
        System.out.println("3 - Pegar produtos");

        System.out.println("");
        System.out.print("-> ");

        int mode = Integer.parseInt(scanner.nextLine());

        if (mode == 1) {
            System.out.println("::Cadastro produto::");
            System.out.println("");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Valor: ");
            Float valor = Float.parseFloat(scanner.nextLine());

            System.out.print("IVA: ");
            Float iva = Float.parseFloat(scanner.nextLine());

            produtoController.salvar(nome, valor, iva);

            System.out.print("Produto salvo!");
        } else if (mode == 2) {
            System.out.println("::Remover produto::");
            System.out.println("");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            produtoController.remover(nome);

            System.out.print("Produto removido!");
        } else if (mode == 3) {
            System.out.println("::Produtos::");
            System.out.println();

            for (Produto produto : produtoController.pegarTodos()) {
                System.out.println(produto.toString());
            }
        }
    }

}
