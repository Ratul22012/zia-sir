import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("📥 Enter the first number:");
        double num1 = sc.nextDouble();

        System.out.println("📥 Enter the second number:");
        double num2 = sc.nextDouble();

        System.out.println("🔢 Choose an operation:");
        System.out.println("➕  Addition (+)");
        System.out.println("➖  Subtraction (-)");
        System.out.println("✖️  Multiplication (*)");
        System.out.println("➗  Division (/)");
        System.out.print("👉 Your choice: ");
        char op = sc.next().charAt(0);

        double result = 0;
        boolean valid = true;

        System.out.println("🧮 Calculating...");

        switch(op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if(num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("❌ Cannot divide by zero!");
                    valid = false;
                }
                break;
            default:
                System.out.println("⚠️ Invalid operation selected!");
                valid = false;
        }

        if(valid)
            System.out.println("✅ Result: " + result + " 🎉");

        System.out.println("🔚 Thank you for using the calculation! 😊");
    }
}
