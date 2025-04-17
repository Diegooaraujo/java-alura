import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.calculos.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("o poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();
        System.out.println("total de avaliações"+ meuFilme.getTotalDeAvaliacoes());
        System.out.println("Duração em minutos"+ meuFilme.getDuracaoEmMinutos());

        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpsodiosPorTemporada(10);
        lost.setMinutosPorEpsodios(50);
        System.out.println("Duração em minutos"+ lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(meuFilme);
        calculadora.incluir(outroFilme);
        calculadora.incluir(lost);
        System.out.println(calculadora.getTempoTotal());


    }
}
