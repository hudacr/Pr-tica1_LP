import java.util.Scanner;
public class Viagem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.printf("Por favor, digite o tempo gasto na viagem (em horas): ");
        double tempoGasto = entrada.nextDouble();

        System.out.printf("Por favor, digite a velocidade média (em km/h): ");
        double velocidadeMedia = entrada.nextDouble();

        System.out.printf("Por favor, digite o consumo do veiculo (em km por litro): ");
        double consumoVeiculo = entrada.nextDouble();

        double distancia = tempoGasto * velocidadeMedia;
        double combustivelGasto = distancia/consumoVeiculo;

        System.out.printf("O consumo final de combustivel gasto com a viagem foi de %.2f Litros" , combustivelGasto);




    }
}
