import java.util.*;
class BankAccount {
    private double balance;

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance=balance+amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount acc = new BankAccount();
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        acc.deposit(amount);
        System.out.println("Current Balance: " + acc.getBalance());

    }
}