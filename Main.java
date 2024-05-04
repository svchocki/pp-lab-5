import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        int sum = MathUtils.add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        
        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
