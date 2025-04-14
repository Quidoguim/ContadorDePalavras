package estruturas;

import modelos.PalavraContada;

public class ListaEstatica {
    private PalavraContada[] palavras;
    private int tamanho;

    public ListaEstatica(int capacidade) {
        palavras = new PalavraContada[capacidade];
        tamanho = 0;
    }

    public void adicionarOuIncrementar(String palavra) {
        for (int i = 0; i < tamanho; i++) {
            if (palavras[i].palavra.equals(palavra)) {
                palavras[i].frequencia++;
                return;
            }
        }

        if (tamanho < palavras.length) {
            palavras[tamanho++] = new PalavraContada(palavra);
        }
    }

    public int getTotalPalavras() {
        int total = 0;
        for (int i = 0; i < tamanho; i++) {
            total += palavras[i].frequencia;
        }
        return total;
    }

    public void imprimirTop20() {
        // Ordenação simples (Bubble Sort) por frequência decrescente
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (palavras[j].frequencia < palavras[j + 1].frequencia) {
                    PalavraContada temp = palavras[j];
                    palavras[j] = palavras[j + 1];
                    palavras[j + 1] = temp;
                }
            }
        }

        int limite = Math.min(20, tamanho);
        for (int i = 0; i < limite; i++) {
            System.out.println(palavras[i].palavra + ": " + palavras[i].frequencia);
        }
    }
}