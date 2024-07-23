package entities;

public class Acocunt {
    public int accountNumber;
    public String accountHolder;
    public double balance;


    public Acocunt(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void saque (double amount) {
        balance -= amount;
    }

    public String toString(){
        return "Titular: " + accountHolder + ", Número da conta: " + accountNumber + ", Saldo: R$" + String.format("%.2f", balance);
    }
}
