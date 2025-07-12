package model;

import dao.MenuDAO;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {

    private String nome;

    private List<Produto> produtos;

    public Menu(String nome, List<Produto> produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Nome do menu: " + this.nome);
        s.append("Produtos do menu: ").append("\n");
        for (Produto produto : this.produtos) {
            s.append("\n");
            s.append(produto.toString());
        }
        return s.toString();
    }

    public List<Menu> pegarTodos() {
        return new MenuDAO().lerTodos();
    }

    public void salvar() {
        new MenuDAO().salvar(this);
    }

    public void remover() {
        new MenuDAO().remover(this.nome);
        ;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
