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

        /*Declare uma variável do tipo double precoProduto e uma variável
         do tipo int (quantidade). Calcule o valor total multiplicando o preço
          do produto pela quantidade e apresente o resultado em uma mensagem.
         */
        double precoProduto = 5.49;
        int quantidade = 8;
        double resultado = precoProduto * quantidade;
        mensagem = String.format("O valor do produto é R$ %f", resultado);
        System.out.println(mensagem);

        /*Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
         Atribua valores a essas variáveis e concatene-as em uma mensagem.
         */
        char letra = 'O';
        String palavra = "tavio";

        String mensagem_char_string = "A letra é " + letra + " e a palavra é " + palavra;
        System.out.println(mensagem_char_string);

        /*Declare uma variável do tipo double valorEmDolares. Atribua um valor
         em dólares a essa variável. Considere que o valor de 1 dólar é equivalente
          a 4.94 reais. Realize a conversão do valor em dólares para reais
           e imprima o resultado formatado.
         */

        double valorEmDolares = 10;
        double resultadoEmReais = valorEmDolares * 4.94;
        mensagem = String.format("O resultado é R$ %.2f", resultadoEmReais);
        System.out.println(mensagem);

        /*Declare uma variável do tipo double precoOriginal.
         Atribua um valor em reais a essa variável, representando o preço original
          de um produto. Em seguida, declare uma variável do tipo double percentualDesconto
           e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
            Calcule o valor do desconto em reais, aplique-o
             ao preço original e imprima o novo preço com desconto.
         */
        double precoOriginal = 15.89;
        double percentualDesconto = 10;
        double descontoAplicado = (precoOriginal * percentualDesconto) /100;
        double resultadoPreco = (precoOriginal - descontoAplicado);
        mensagem = String.format("O desconto aplicado será de R$ %.2f, o novo valor será de R$ %.2f", descontoAplicado, resultadoPreco);
        System.out.println(mensagem);
    }
}