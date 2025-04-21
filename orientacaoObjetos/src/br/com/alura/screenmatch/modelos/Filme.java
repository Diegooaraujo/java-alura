package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome ;
    private int anoDeLancameto;
    boolean includoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public void exibeFicha(){
        System.out.println("Nome do filme "+nome);
        System.out.println("Ano de lançamento "+anoDeLancameto);
    }

    public void avaliar(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double obterMedia(){
        return somaAvaliacoes/totalDeAvaliacoes;
    }
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
}
