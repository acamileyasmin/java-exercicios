package model;

import java.io.Serializable;
import java.util.List;

import dao.ProdutoDAO;

public class Produto implements Serializable {

    private String nome;

    private float valor;

    private float iva;

    public Produto(String nome, float valor, float iva) {
        this.nome = nome;
        this.valor = valor;
        this.iva = iva;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s - Valor: %s - Iva: %s", this.nome, this.valor, this.iva);
    }

    public List<Produto> pegarTodos() {
        return new ProdutoDAO().lerTodos();
    }

    public void salvar() {
        new ProdutoDAO().salvar(this);
    }

    public void remover() {
        new ProdutoDAO().remover(this.nome);;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getIva() {
        return this.iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
}
