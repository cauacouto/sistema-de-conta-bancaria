import java.util.Scanner;

public class contabancaria {
    public static void main(String[] args) {

        String nome= "aleatorio";
        String tipoDeConta= "conta corrente";
        double saldo= 1500.00;
        System.out.println("**************************");
        System.out.println(" cliente: " +nome);
        System.out.println(" tipo de conta: " +tipoDeConta);
        System.out.println(" saldo: " +saldo);
        System.out.println("*****************************");


        int opcao= 0;

        String menu= """
                  ** digite sua opção**
                  
                  1-cosultar saldo
                  2- transferir valor
                  3- receber valor
                  4-sair
                  
               """;


        Scanner leitura = new Scanner(System.in);
        while(opcao != 4){
            System.out.println(menu);
            opcao= leitura.nextInt();

         if(opcao == 1){
             System.out.println(" seu saldo é de R$ "+saldo);
         }else if(opcao == 2){
             System.out.println(" qual valor deseja transferir? ");
             double valor= leitura.nextDouble();
             if(valor>saldo){
                 System.out.println(" não ha saldo suficiente para transação ");
             } else {
                 saldo-=valor;
                 System.out.println(" saldo atual: " + saldo);

             }

         }
         else if(opcao == 3){
             System.out.println(" valor recebido ");
             double valor= leitura.nextDouble();
             saldo+=valor;
             System.out.println(" saldo atual: " + saldo);
         }
         else if(opcao != 4){
             System.out.println(" opção invalida ");

         }
         }

             }
            }













