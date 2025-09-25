import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome = "Lucas Nazário";
        String tipoConta = "Conta Corrente";
        double saldo = 2000.00;

        System.out.println("MINHAS FINANÇAS \n" +
                " Nome: " + nome + "\n" +
                " Tipo de conta: " + tipoConta + "\n"+
                " Saldo: " + saldo);

        Scanner insereOpcao = new Scanner(System.in);
        int opcao = 0;
        double saque = 0;
        double deposito = 0;

        String menu = """
                  1 - Verificar Saldo
                  2 - Sacar
                  3 - Depositar
                  4 - Crédito
                  5 - Sair
               """;

        while (opcao != 5) {
            System.out.println(menu);
            opcao = insereOpcao.nextInt();
            if (opcao == 1){
                System.out.println(saldo);
            } else if(opcao == 2) {
                System.out.println("Digite o valor a ser sacado:");
                Scanner sacarDinheiro = new Scanner(System.in);
                saque = sacarDinheiro.nextDouble();
                if(saque <= saldo){
                    saldo = saldo - saque;
                    System.out.println(saldo);
                } else {
                    System.out.println("Saldo Insuficiente!");
                }
        } else if (opcao == 3){
                System.out.println("Digite o valor a ser inserido:");
                Scanner depositarSaldo =  new Scanner(System.in);
                deposito = depositarSaldo.nextDouble();
                saldo = deposito + saldo;
                System.out.println(saldo);
            } else {
                System.out.println("Em breve");
            }
        }
    }
}