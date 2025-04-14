package utils;

import java.io.*;

public class FileReaderUtil {
    public static String lerArquivo(String caminho) {
        StringBuilder conteudo = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                conteudo.append(linha).append(" ");
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return null;
        }
        return conteudo.toString();
    }
}