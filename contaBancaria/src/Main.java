import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome ="diego";
        String conta = "Corrente";
        double saldo = 9999999.99;
        int opcao=0;

        System.out.println("******************************");
        System.out.println("Nome do Cliente: "+nome) ;
        System.out.println("Saldo Atual: "+saldo);
        System.out.println("******************************");

        String menu = """
                ** Digite sua opção **
                1 - consultar saldo
                2 - Transferir valor
                3 - Receber Valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);
        while(opcao !=4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é:"+ saldo );
            }else if(opcao ==2){
                System.out.println("qual o valor que deseja transferir:");
                double valor = leitura.nextDouble();
                if(valor>saldo){
                    System.out.println("saldo insuficiente.");

                }else{
                    saldo -= valor;
                    System.out.println("valor transferido!");
                    System.out.println("saldo disponivel:"+saldo);

                }
            }else if(opcao ==3){
                System.out.println("valor recebido:");
                double valor = leitura.nextDouble();
                saldo +=valor;
                System.out.println("valor adicionado! "+valor);
            }else if(opcao != 4){
                System.out.println("Opção invalida");
            }

        }

    }
}