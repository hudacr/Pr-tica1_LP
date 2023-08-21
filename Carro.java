import java.util.Scanner;
public class Carro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Insira a placa do carro: ");
        String placaDoCarro = entrada.next();
        String placaBorrada = placaDoCarro.replaceAll("a", "*").replaceAll("e", "*").replaceAll("i", "*").replaceAll("o", "*").replaceAll("u", "*").replaceAll("A", "*").replaceAll("E", "*").replaceAll("I", "*").replaceAll("O", "*").replaceAll("U", "*");

        System.out.printf("Insira o ano de fabricação do veiculo: ");
        double anoDeFabricacao = entrada.nextDouble();

        System.out.println(placaBorrada);


        if (anoDeFabricacao <2010)
            System.out.println("Carro Velho");

        else if (anoDeFabricacao >= 2011 && anoDeFabricacao <= 2021)
                System.out.println("Carro Semi Novo");

        else if  (anoDeFabricacao == 2022)
        System.out.println("Carro Novo");

        else
            System.out.println("Carro Invalido");

    }
}
