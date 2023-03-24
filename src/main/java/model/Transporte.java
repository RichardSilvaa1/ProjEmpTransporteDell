package model;

import java.util.List;
public class Transporte {
    private Conexao conexao;
    private Caminhao caminhao;
    private List<Item> carga;
    private double custo;

    public Transporte(Conexao conexao, Caminhao caminhao, List<Item> carga) {
        this.conexao = conexao;
        this.caminhao = caminhao;
        this.carga = carga;

        // Extrai a distância da conexão correspondente
        double[][] distancias = conexao.getDistancias();
        int origem = conexao.getOrigem().getId();
        int destino = conexao.getDestino().getId();
        double distancia = distancias[origem][destino];

        // Calcula o custo total
        double pesoTotal = 0.0;
        for (Item item : carga) {
            pesoTotal += item.getPeso();
        }
        if (pesoTotal > caminhao.getPesoMaximo()) {
            this.custo = Double.POSITIVE_INFINITY; // retorna infinito se o peso total excede o limite do caminhão
        } else {
            this.custo = caminhao.getCustoKm() * distancia;
        }
    }

    public double getCusto() {
        return custo;
    }
}
