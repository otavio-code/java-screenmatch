import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe a temperatura em graus Celsius para converter em Fahrenheit: ");
        double temperatura_fahrenheit;
        double temperatura_celsius;
        Scanner ler = new Scanner(System.in);
        temperatura_celsius = ler.nextDouble();
        temperatura_fahrenheit = (temperatura_celsius * 1.8) + 32;

        String mensagem = String.format("A temperatura em graus celsius %f é equivalente a temperatura %f em farenheit: ", temperatura_celsius, temperatura_fahrenheit);
        System.out.println(mensagem);

    }
}