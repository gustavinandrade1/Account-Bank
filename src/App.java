import java.util.Locale;
import java.util.Scanner;

import entities.Acocunt;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o número da conta: ");
        int accountNumber = sc.nextInt();
        System.out.print("Entre com o titular da conta: ");
        String accountHolder = sc.next();
        Acocunt account = new Acocunt(accountNumber, accountHolder);
        System.out.println();
        int resposta;
        double depositeValue, saqueValue;
        do {
            System.out.println("Selecione a opção que deseja: ");
            System.out.println("1 - Depósito.");
            System.out.println("2 - Saque.");
            System.out.println("3 - Saldo.");
            System.out.println("4 - Sair do sistema.");
            resposta = sc.nextInt();
            System.out.println();
            switch (resposta) {
                case 1:
                    System.out.print("Qual o valor do depósito: ");
                    depositeValue = sc.nextDouble();
                    account.deposit(depositeValue);
                    System.out.println();
                    System.out.println(account.toString());
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("Qual o valor do saque: ");
                    saqueValue = sc.nextDouble();
                    account.saque(saqueValue);
                    System.out.println();
                    System.out.println(account.toString());
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println(account.toString());
                default:
                    break;
            }
        } while (resposta != 4);

        sc.close();

    }
}
