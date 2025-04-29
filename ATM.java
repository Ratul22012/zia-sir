import java.util.Scanner;

public class ATM {
    private double balance = 10000.0;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("💰 Successfully deposited: ৳" + amount);
        } else {
            System.out.println("⚠️ Invalid amount! Please enter a positive number.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("💸 Successfully withdrawn: ৳" + amount);
            } else {
                System.out.println("❌ Insufficient balance!");
            }
        } else {
            System.out.println("⚠️ Invalid amount! Please enter a positive number.");
        }
    }

    public void checkBalance() {
        System.out.println("📊 Current Balance: ৳" + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        System.out.println("🏧 Welcome to ATM Machine 💳");

        while (true) {
            System.out.println("\n🔘 Please choose an option:");
            System.out.println("1️⃣ Deposit");
            System.out.println("2️⃣ Withdraw");
            System.out.println("3️⃣ Check Balance");
            System.out.println("4️⃣ Exit");

            System.out.print("👉 Your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("💵 Enter deposit amount: ");
                    atm.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("💳 Enter withdrawal amount: ");
                    atm.withdraw(sc.nextDouble());
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println(" Thank you for using our ATM! Goodbye! 👋");
                    System.exit(0);
                    break;
                default:
                    System.out.println("❗ Invalid option. Please try again.");
            }
        }
    }
}
