package controller;

import model.Endereco;

import java.util.List;

public class EnderecoController {

    public Endereco salvar(String cep, String tipo, int numero) {
        Endereco endereco = new Endereco(tipo, cep , numero);
        endereco.salvar();
        return endereco;
    }

    public List<Endereco> pegarTodos() {
        return new Endereco(null, null, 0).pegarTodos();
    }

    public Endereco pegarPeloCep(String cep) {
        for (Endereco endereco : this.pegarTodos()) {
            if (endereco.getCep().equals(cep)) {
                return endereco;
            }
        }
        return null;
    }

    public void excluir(String cep) {
        new Endereco(null, cep, 0).excluir();
    }

}
