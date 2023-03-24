package model;

import java.util.HashMap;
import java.util.Map;

public class Cidade {
    private int id;
    private String nome;
    private Map<Cidade, Double> conexoes;

    public Cidade(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.conexoes = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConexao(Cidade cidade, Double distancia) {
        conexoes.put(cidade, distancia);
    }

    public Double getDistanciaPara(Cidade cidade) {
        return conexoes.get(cidade);
    }
}
