package model;

public class Conexao {
    private Cidade origem;
    private Cidade destino;
    private double distancia;
    private Transporte transporte;

    public Conexao(Cidade origem, Cidade destino, double distancia, Transporte transporte) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.transporte = transporte;
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

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
}

