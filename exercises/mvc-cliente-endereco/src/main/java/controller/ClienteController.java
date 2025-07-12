package controller;

import model.Cliente;
import model.Endereco;

import java.util.List;

public class ClienteController {

    public void salvar(String nome, String cpf, Endereco endereco) {
        Cliente cliente = new Cliente(nome, cpf, endereco);
        cliente.salvar();
    }

    public void excluir(String nome) {
        Cliente cliente = new Cliente(nome, null, null);
        cliente.excluir();
    }

    public List<Cliente> pegarTodos() {
        return new Cliente(null, null, null).pegarTodos();
    }

}
