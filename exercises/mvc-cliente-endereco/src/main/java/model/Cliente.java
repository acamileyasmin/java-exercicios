package model;

import dao.ClienteDAO;

import java.io.Serializable;
import java.util.List;

public class Cliente extends Pessoa implements Serializable {

    public Cliente(String nome, String numeroCpf, Endereco endereco) {
        super(nome, numeroCpf, endereco);
    }

    public void salvar() {
        new ClienteDAO().salvar(this);
    }

    public void excluir() {
        new ClienteDAO().excluir(this.getNome());
    }

    public List<Cliente> pegarTodos() {
        return new ClienteDAO().pegarTodos();
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " - CPF: " + this.getNumeroCpf() + " - Endereço: " + this.getEndereco();
    }
}
