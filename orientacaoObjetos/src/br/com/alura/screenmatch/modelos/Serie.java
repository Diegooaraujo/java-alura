package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean atiava;
    private int epsodiosPorTemporada;
    private int minutosPorTemporadas;
    private int minutosPorEpsodios;

    public void setMinutosPorEpsodios(int minutosPorEpsodios) {
        this.minutosPorEpsodios = minutosPorEpsodios;
    }

    public int getMinutosPorEpsodios() {
        return minutosPorEpsodios;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAtiava(boolean atiava) {
        this.atiava = atiava;
    }

    public void setEpsodiosPorTemporada(int epsodiosPorTemporada) {
        this.epsodiosPorTemporada = epsodiosPorTemporada;
    }

    public void setMinutosPorTemporadas(int minutosPorTemporadas) {
        this.minutosPorTemporadas = minutosPorTemporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiava() {
        return atiava;
    }

    public int getEpsodiosPorTemporada() {
        return epsodiosPorTemporada;
    }

    public int getMinutosPorTemporadas() {
        return minutosPorTemporadas;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsodiosPorTemporada* minutosPorTemporadas;
    }
}
