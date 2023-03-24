package model;

import java.util.List;

public class Transporte {
    private Caminhao caminhao;
    private Cidade origem;
    private Cidade destino;
    private List<Item> carga;
    private double distancia;

    public Transporte(Caminhao caminhao, Cidade origem, Cidade destino, List<Item> carga, double distancia) {
        this.caminhao = caminhao;
        this.origem = origem;
        this.destino = destino;
        this.carga = carga;
        this.distancia = distancia;
    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    public List<Item> getCarga() {
        return carga;
    }

    public void setCarga(List<Item> carga) {
        this.carga = carga;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getCusto() {
        double pesoTotal = 0.0;
        for (Item item : carga) {
            pesoTotal += item.getPeso();
        }
        if (pesoTotal > caminhao.getPesoMaximo()) {
            throw new IllegalArgumentException("Peso da carga excede o limite do caminhão.");
        }
        double custoTotal = caminhao.getCustoKm() * distancia;
        return custoTotal;
    }
}

