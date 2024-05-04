import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota_1;
        System.out.println("Informe a nota 1:");
        Scanner sc1 = new Scanner(System.in);
        nota_1 = sc1.nextDouble();

        double nota_2;
        System.out.println("Informe a nota 2:");
        Scanner sc2 = new Scanner(System.in);
        nota_2 = sc2.nextDouble();

        double media = (nota_1 + nota_2) / 2;
        String mensagem = String.format("A média das notas %f e %f. Tem como resultado %f", nota_1, nota_2, media);
        System.out.println(mensagem);

        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

        double var1;
        int var2;
        var1 = 3.434;
        var2 = (int) (var1);
        System.out.println("Imprimindo a variavel " + var2);
    }
}