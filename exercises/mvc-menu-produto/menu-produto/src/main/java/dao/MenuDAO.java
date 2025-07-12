package dao;

import db.DbFile;
import model.Menu;

import java.util.Iterator;
import java.util.List;

public class MenuDAO {

    public List<Menu> lerTodos() {
        return DbFile.carregar().getMenus();
    }

    public void salvar(Menu menu) {
        DbFile dbFile = DbFile.carregar();

        boolean novo = true;
        for (Menu dbFileMenu : dbFile.getMenus()) {
            if (dbFileMenu.getNome().equals(menu.getNome())) {
                dbFileMenu.getProdutos().clear();
                dbFileMenu.setProdutos(menu.getProdutos());
                novo = false;
            }
        }

        if (novo) {
            dbFile.getMenus().add(menu);
        }

        DbFile.salvar(dbFile);
    }

    public void remover(String nome) {
        DbFile dbFile = DbFile.carregar();

        Iterator<Menu> iterator = dbFile.getMenus().iterator();

        while (iterator.hasNext()) {
            Menu m = iterator.next();
            if (m.getNome().equals(nome)) {
                iterator.remove();
            }
        }

        DbFile.salvar(dbFile);
    }

}
