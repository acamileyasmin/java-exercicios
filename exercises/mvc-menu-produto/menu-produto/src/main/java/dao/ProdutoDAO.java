package dao;

import java.util.Iterator;
import java.util.List;

import db.DbFile;
import model.Produto;

public class ProdutoDAO {

    public List<Produto> lerTodos() {
        return DbFile.carregar().getProdutos();
    }
    
    public void salvar(Produto produto) {
        DbFile dbFile = DbFile.carregar();
        dbFile.getProdutos().add(produto);
        DbFile.salvar(dbFile);
    }
    
    public void remover(String nome) {
        DbFile dbFile = DbFile.carregar();

        Iterator<Produto> iterator = dbFile.getProdutos().iterator();

        while(iterator.hasNext()) {
            Produto p = iterator.next();
            if (p.getNome().equals(nome)) {
                iterator.remove();
            }
        }

        DbFile.salvar(dbFile);
    }

}
