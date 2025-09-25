import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome = "Lucas Nazário";
        String tipoConta = "Conta Corrente";
        double saldo = 2000.00;
        System.out.println("-------------------------------------------------------");
        System.out.println("MINHAS FINANÇAS \n" +
                " Nome: " + nome + "\n" +
                " Tipo de conta: " + tipoConta + "\n" +
                " Saldo: " + saldo);
        System.out.println("-------------------------------------------------------");
        Scanner insereOpcao = new Scanner(System.in);
        int opcao = 0;
        double saque = 0;
        double deposito = 0;

        String menu = """
                   1 - Verificar Saldo
                   2 - Sacar
                   3 - Depositar
                   4 - Sair
                   Escolha a opção:
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = insereOpcao.nextInt();
            if (opcao == 1) {
                System.out.println("Saldo Atual: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser sacado:");
                saque = insereOpcao.nextDouble();
                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saldo Atual: " + saldo);
                } else {
                    System.out.println("Saldo Insuficiente!");
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser inserido:");
                deposito = insereOpcao.nextDouble();
                saldo += deposito;
                System.out.println("Saldo Insuficiente!");
            } else if (opcao != 4) {
                System.out.println("Opção Inválida!");
            }
        }
    }
}