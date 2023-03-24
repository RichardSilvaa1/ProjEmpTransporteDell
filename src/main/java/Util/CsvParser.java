package Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import model.Cidade;
import model.Conexao;



public class CsvParser {
    private String filePath;
    private Map<String, Cidade> cidades;
    private Map<Conexao, Integer> distancias;

    public CsvParser(String filePath) {
        this.filePath = filePath;
        this.cidades = new HashMap<>();
        this.distancias = new HashMap<>();
    }

    public void parseCsv() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String[] cidadeNames = reader.readLine().split(",");

        for (String cidadeName : cidadeNames) {
            Cidade cidade = new Cidade(cidadeName);
            cidades.put(cidadeName, cidade);
        }

        String line;
        int row = 0;
        while ((line = reader.readLine()) != null) {
            String[] distances = line.split(",");
            for (int col = 0; col < distances.length; col++) {
                int distance = Integer.parseInt(distances[col]);
                Cidade cidadeOrigem = cidades.get(cidadeNames[row]);
                Cidade cidadeDestino = cidades.get(cidadeNames[col]);
                Conexao conexao = new Conexao(cidadeOrigem, cidadeDestino);
                double[][] matrizDistancias = {{distance}};
                conexao.setDistancias(matrizDistancias);
                distancias.put(conexao, distance);
                cidadeOrigem.adicionarConexao(cidadeDestino, (double) distance);
            }
            row++;
        }

        reader.close();
    }

    public Map<String, Cidade> getCidades() {
        return cidades;
    }

    public Map<Conexao, Integer> getDistancias() {
        return distancias;
    }
}
