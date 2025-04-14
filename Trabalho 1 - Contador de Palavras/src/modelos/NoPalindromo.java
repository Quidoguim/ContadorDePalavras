package modelos;

public class NoPalindromo {
    public String palavra;
    public NoPalindromo proximo;

    public NoPalindromo(String palavra) {
        this.palavra = palavra;
        this.proximo = null;
    }
}