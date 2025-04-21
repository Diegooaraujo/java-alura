import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome ="o poderoso chefão";
        meuFilme.anoDeLancameto = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFicha();

        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);

        System.out.println("total de avaliações "+meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obterMedia());


    }
}
