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
        }
    }
}