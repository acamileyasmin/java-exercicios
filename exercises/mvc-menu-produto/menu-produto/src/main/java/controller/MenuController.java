package controller;

import model.Menu;
import model.Produto;

import java.util.Iterator;
import java.util.List;

public class MenuController {

    public void salvar(String nome, List<Produto> produtos) {
        Menu menu = new Menu(nome, produtos);
        menu.salvar();
    }

    public List<Menu> pegarTodos() {
        return new Menu(null, null).pegarTodos();
    }

    public boolean adicionarProduto(String nomeDoMenu, String nomeDoProduto) {
        Menu menuSelecionado = null;
        for (Menu menu : this.pegarTodos()) {
            if (menu.getNome().equals(nomeDoMenu)) {
                menuSelecionado = menu;
                break;
            }
        }

        if (menuSelecionado == null) {
            return false;
        }

        Produto produtoSelecionado = null;
        for (Produto produto : new Produto(null, 0, 0).pegarTodos()) {
            if (produto.getNome().equals(nomeDoProduto)) {
                produtoSelecionado = produto;
                break;
            }
        }

        if (produtoSelecionado == null) {
            return false;
        }

        menuSelecionado.getProdutos().add(produtoSelecionado);

        menuSelecionado.salvar();

        return true;
    }

    public boolean removerProduto(String nomeDoMenu, String nomeDoProduto) {
        Menu menuSelecionado = null;
        for (Menu menu : this.pegarTodos()) {
            if (menu.getNome().equals(nomeDoMenu)) {
                menuSelecionado = menu;
                break;
            }
        }

        if (menuSelecionado == null) {
            return false;
        }

        Iterator<Produto> iterator = menuSelecionado.getProdutos().iterator();

        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getNome().equals(nomeDoProduto)) {
                iterator.remove();
                break;
            }
        }

        menuSelecionado.salvar();

        return true;
    }

    public void remover(String nome) {
        new Menu(nome, null).remover();
    }

}