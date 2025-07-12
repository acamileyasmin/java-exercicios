package view;

import controller.EnderecoController;
import model.Endereco;

import java.util.Scanner;

public class EnderecoScan {

    public static void main(String[] args) {
        EnderecoController enderecoController = new EnderecoController();

        Scanner scanner = new Scanner(System.in);

        System.out.println("::Restaurante projeto - Endereço::");
        System.out.println();
        System.out.println("1 - Cadastrar endereço");
        System.out.println("2 - Deletar endereco");
        System.out.println("3 - Mostrar enderecos");

        System.out.println();
        System.out.print("-> ");

        int mode = Integer.parseInt(scanner.nextLine());

        if (mode == 1) {
            System.out.println("::Cadastrar endereco::");
            System.out.println();

            System.out.print("CEP: ");
            String cep = scanner.nextLine();

            System.out.print("Tipo: ");
            String tipo = scanner.nextLine();

            System.out.print("Número: ");
            int numero = scanner.nextInt();

            enderecoController.salvar(cep, tipo, numero);

            System.out.print("Endereço salvo!");
        } else if (mode == 2) {
            System.out.println("::Excluir endereço::");
            System.out.println();

            System.out.print("CEP: ");
            String cep = scanner.nextLine();

            enderecoController.excluir(cep);

            System.out.print("Endereço excluído!");
        } else if (mode == 3) {
            System.out.println("::Endereços::");
            System.out.println();

            for (Endereco endereco : enderecoController.pegarTodos()) {
                System.out.println(endereco.toString());
            }
        }
    }

}
