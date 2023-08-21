import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contadorVogais = contarVogais(frase);

        System.out.println("Número de vogais na frase: " + contadorVogais);
    }

    private static int contarVogais(String frase) {
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            if (vogais.indexOf(caractere) != -1) {
                contador++;
            }
        }

        return contador;
    }
}
