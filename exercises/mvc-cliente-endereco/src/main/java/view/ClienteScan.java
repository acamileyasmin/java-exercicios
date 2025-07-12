package view;

import controller.ClienteController;
import controller.EnderecoController;
import model.Cliente;
import model.Endereco;

import java.util.Scanner;

public class ClienteScan {

    public static void main(String[] args) {
        ClienteController clienteController = new ClienteController();
        EnderecoController enderecoController = new EnderecoController();

        Scanner scanner = new Scanner(System.in);

        System.out.println("::Restaurante projeto - Cliente::");
        System.out.println();
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Deletar cliente");
        System.out.println("3 - Mostrar clientes");

        System.out.println();
        System.out.print("-> ");

        int mode = Integer.parseInt(scanner.nextLine());

        if (mode == 1) {
            System.out.println("::Cadastrar cliente::");
            System.out.println();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Endereço (cep): ");
            String cep = scanner.nextLine();

            Endereco endereco = enderecoController.pegarPeloCep(cep);
            if (endereco == null) {
                System.out.print("Endereço não existe! Realize o procedimento novamente.");
                System.exit(1);
            }

            clienteController.salvar(nome, cpf, endereco);

            System.out.print("Cliente salvo!");
        } else if (mode == 2) {
            System.out.println("::Excluir cliente::");
            System.out.println();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            clienteController.excluir(nome);

            System.out.print("Cliente excluído!");
        } else if (mode == 3) {
            System.out.println("::Clientes::");
            System.out.println();

            for (Cliente cliente : clienteController.pegarTodos()) {
                System.out.println(cliente.toString());
            }
        }
    }

}
