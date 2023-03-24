package model;

public class Conexao {
    private Cidade origem;
    private Cidade destino;
    private int distancia;
    private Transporte transporte;

    public Conexao(Cidade origem, Cidade destino, int distancia, Transporte transporte) {
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

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
}
