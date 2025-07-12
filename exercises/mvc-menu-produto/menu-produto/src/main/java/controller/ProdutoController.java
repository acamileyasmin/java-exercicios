package controller;

import java.util.List;

import model.Produto;

public class ProdutoController {
    
    public void salvar(String nome, float valor, float iva) {
        Produto produto = new Produto(nome, valor, iva);
        produto.salvar();
    }

    public List<Produto> pegarTodos() {
        return new Produto(null, 0, 0).pegarTodos();
    }

    public Produto pegar(String nome) {
        for (Produto produto : new Produto(null, 0, 0).pegarTodos()) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void remover(String nome) {
        new Produto(nome, 0, 0).remover();
    }

}
