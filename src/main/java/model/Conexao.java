package model;

public class Conexao {
    private Cidade origem;
    private Cidade destino;
    private double[][] distancias;
    private Transporte transporte;

    public Conexao(Cidade origem, Cidade destino, double[][] distancias, Transporte transporte) {
        this.origem = origem;
        this.destino = destino;
        this.distancias = distancias;
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

    public double[][] getDistancias() {
        return distancias;
    }

    public void setDistancias(double[][] distancias) {
        this.distancias = distancias;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
}