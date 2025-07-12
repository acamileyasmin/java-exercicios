package model;

import dao.EnderecoDAO;

import java.io.Serializable;
import java.util.List;

public class Endereco implements Serializable {

    private String tipo;

    private String cep;

    private int numero;

    public Endereco(String tipo, String cep, int numero) {
        this.tipo = tipo;
        this.cep = cep;
        this.numero = numero;
    }

    public void salvar() {
        new EnderecoDAO().salvar(this);
    }

    public List<Endereco> pegarTodos() {
        return new EnderecoDAO().pegarTodos();
    }

    public void excluir() {
        new EnderecoDAO().excluir(this.cep);
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return this.cep + " - " + this.tipo + " " + this.numero;
    }
}
