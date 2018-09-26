import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        double number1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double number2 = input.nextDouble();
        int choice;
        do {
            System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println(add(number1, number2));
            } else if (choice == 2) {
                System.out.println(subtract(number1, number2));
            } else if (choice == 3) {
                System.out.println(multiply(number1, number2));
            } else if (choice == 4) {
                System.out.println(divide(number1, number2));
            } else {
                System.out.println("Please enter a valid choice.");
            }
        } while (choice < 1 || choice > 4);
    }
    
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
    
}
