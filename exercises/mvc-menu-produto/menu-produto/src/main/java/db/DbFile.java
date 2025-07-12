package db;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import model.Menu;
import model.Produto;

public class DbFile implements Serializable{

    private static final String DB_PATH = "src\\main\\java\\db\\db.txt";
    
    private List<Produto> produtos;

    private List<Menu> menus;

    public DbFile() {
        this.produtos = new ArrayList<>();
        this.menus = new ArrayList<>();
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
                e.printStackTrace();
            }
            salvar(new DbFile());
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(DB_PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            return (DbFile) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Menu> getMenus() {
        return this.menus;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

}
