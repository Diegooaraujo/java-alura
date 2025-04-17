import br.com.alura.screenmatch.modelos.Filme;

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



    }
}
