import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe a temperatura em graus Celsius para converter em Fahrenheit: ");
        double temperatura_fahrenheit;
        double temperatura_celsius;
        Scanner ler = new Scanner(System.in);
        temperatura_celsius = ler.nextDouble();
        temperatura_fahrenheit = (temperatura_celsius * 1.8) + 32;
        System.out.println("A temperatura em farenheit: " + temperatura_fahrenheit);

    }
}