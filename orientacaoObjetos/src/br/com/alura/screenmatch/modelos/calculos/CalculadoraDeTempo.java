package br.com.alura.screenmatch.modelos.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;


    public int getTempoTotal() {
        return this.tempoTotal;
    }


//    public void incluirFilme(Filme f){
//        this.tempoTotal+= f.getDuracaoEmMinutos();
//    }
//    public void incluirFilme(Serie f){
//        this.tempoTotal+= f.getDuracaoEmMinutos();
//    }

    public void incluir(Titulo tituol){
        this.tempoTotal+=tituol.getDuracaoEmMinutos();
    }
}
