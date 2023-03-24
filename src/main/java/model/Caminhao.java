package model;

public class Caminhao {
    private double pesoMaximo;
    private double custoKm;
    private String porte;

    public Caminhao(String porte) {
        this.porte = porte;

        switch (porte) {
            case "PEQUENO":
                pesoMaximo = 1000;
                custoKm = 4.87;
                break;
            case "MEDIO":
                pesoMaximo = 3000;
                custoKm = 11.92;
                break;
            case "GRANDE":
                pesoMaximo = 15000;
                custoKm = 27.44;
                break;
            default:
                throw new IllegalArgumentException("Porte de caminhão inválido.");
        }
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public double getCustoKm() {
        return custoKm;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}
