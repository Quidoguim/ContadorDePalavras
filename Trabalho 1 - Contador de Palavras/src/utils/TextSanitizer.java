package utils;

public class TextSanitizer {
    public static String[] sanitizar(String texto) {
        texto = texto.toLowerCase();
        texto = texto.replaceAll("[^a-z0-9 ]", " ");
        return texto.trim().split("\\s+");
    }

    public static boolean ehPalindromo(String palavra) {
        int i = 0, j = palavra.length() - 1;
        while (i < j) {
            if (palavra.charAt(i) != palavra.charAt(j)) return false;
            i++;
            j--;
        }
        return palavra.length() > 1;
    }
}