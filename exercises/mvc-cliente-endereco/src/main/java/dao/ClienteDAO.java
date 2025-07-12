package dao;

import db.DbFile;
import model.Cliente;

import java.util.Iterator;
import java.util.List;

public class ClienteDAO {

    public void salvar(Cliente cliente) {
        DbFile dbFile = DbFile.carregar();

        List<Cliente> clients = dbFile.getClients();
        clients.add(cliente);

        DbFile.salvar(dbFile);
    }

    public List<Cliente> pegarTodos() {
        DbFile dbFile = DbFile.carregar();
        return dbFile.getClients();
    }

    public void excluir(String nome) {
        DbFile dbFile = DbFile.carregar();

        Iterator<Cliente> iterator = dbFile.getClients().iterator();

        while (iterator.hasNext()) {
            Cliente client = iterator.next();

            if (client.getNome().equals(nome)) {
                iterator.remove();
                break;
            }
        }

        DbFile.salvar(dbFile);
    }

}
