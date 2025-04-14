package estruturas;

import modelos.NoPalindromo;

public class ListaEncadeada {
    private NoPalindromo inicio;

    public void adicionar(String palavra) {
        if (!contem(palavra)) {
            NoPalindromo novo = new NoPalindromo(palavra);
            novo.proximo = inicio;
            inicio = novo;
        }
    }

    private boolean contem(String palavra) {
        NoPalindromo atual = inicio;
        while (atual != null) {
            if (atual.palavra.equals(palavra))
                return true;
            atual = atual.proximo;
        }
        return false;
    }

    public void imprimir() {
        NoPalindromo atual = inicio;
        while (atual != null) {
            System.out.println(atual.palavra);
            atual = atual.proximo;
        }
    }
}