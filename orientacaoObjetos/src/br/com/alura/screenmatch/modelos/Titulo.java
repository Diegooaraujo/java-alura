package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome ;
    private int anoDeLancamento;
    private boolean includoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void exibeFichaTecnica(){
        System.out.println("Nome doo filme "+this.nome);
        System.out.println("Ano de lancamento "+ this.anoDeLancamento);
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }



    public void avalia(double nota){
        avaliacao += nota;
        totalDeAvaliacoes++;
    }
}
