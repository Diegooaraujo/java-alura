package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio{
    private String album;
    private String cantor;
    private String Genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 2000){
            return 10;

        }else{
            return 6;
        }
    }
}
