import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite o seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("qual o ano de lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("avaliação");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);



    }
}
