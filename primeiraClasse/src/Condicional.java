public class Condicional {
    public static void main(String[] args) {
        int ano = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(ano>=2022){
            System.out.println("lançamentos que os clientes estão curtindo");
        }else{
            System.out.println("filme retro");
        }
        if(incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("deve pagar");
        }


    }
}
