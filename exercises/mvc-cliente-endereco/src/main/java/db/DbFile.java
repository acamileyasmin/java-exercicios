package db;

import model.Cliente;
import model.Endereco;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DbFile implements Serializable {

    private static final String DB_PATH = "src\\main\\java\\db\\db.txt";

    private List<Cliente> clientes;

    private List<Endereco> enderecos;

    public DbFile() {
        this.clientes = new ArrayList<>();
        this.enderecos = new ArrayList<>();
    }

    public static void salvar(DbFile dbFile) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(DB_PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(dbFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DbFile carregar() {
        Path path = Paths.get(DB_PATH);

        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException();
            }
            salvar(new DbFile());
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(DB_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            return (DbFile) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException();
        }
    }

    public List<Cliente> getClients() {
        return this.clientes;
    }

    public List<Endereco> getEnderecos() {
        return this.enderecos;
    }

}
