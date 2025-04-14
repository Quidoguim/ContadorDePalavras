import utils.*;
import estruturas.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: java Main <arquivo.txt>");
            return;
        }

        String caminhoArquivo = args[0];
        String conteudo = FileReaderUtil.lerArquivo(caminhoArquivo);
        if (conteudo == null)
            return;

        String[] palavras = TextSanitizer.sanitizar(conteudo);

        ListaEstatica listaPalavras = new ListaEstatica(1000);
        ListaEncadeada listaPalindromos = new ListaEncadeada();

        for (String palavra : palavras) {
            listaPalavras.adicionarOuIncrementar(palavra);
            if (TextSanitizer.ehPalindromo(palavra)) {
                listaPalindromos.adicionar(palavra);
            }
        }

        System.out.println("Total de palavras: " + listaPalavras.getTotalPalavras());
        System.out.println("\nTop 20 palavras:");
        listaPalavras.imprimirTop20();

        System.out.println("\nPalíndromos encontrados:");
        listaPalindromos.imprimir();
    }
}