public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano do lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFIlme = 8.1;
        // Média calculada pelas 3 notas
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println("Media: " + media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com o galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        //casting explicíto na variável classficacao, transformando o valor que está recebendo em um inteiro
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}