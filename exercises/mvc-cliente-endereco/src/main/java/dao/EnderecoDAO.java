package dao;

import db.DbFile;
import model.Endereco;

import java.util.Iterator;
import java.util.List;

public class EnderecoDAO {

    public void salvar(Endereco endereco) {
        DbFile dbFile = DbFile.carregar();

        List<Endereco> enderecos = dbFile.getEnderecos();
        enderecos.add(endereco);

        DbFile.salvar(dbFile);
    }

    public List<Endereco> pegarTodos() {
        DbFile dbFile = DbFile.carregar();
        return dbFile.getEnderecos();
    }

    public void excluir(String cep) {
        DbFile dbFile = DbFile.carregar();

        Iterator<Endereco> iterator = dbFile.getEnderecos().iterator();

        while (iterator.hasNext()) {
            Endereco endereco = iterator.next();

            if (endereco.getCep().equals(cep)) {
                iterator.remove();
                break;
            }
        }

        DbFile.salvar(dbFile);
    }

}
