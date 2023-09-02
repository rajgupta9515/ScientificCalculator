import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        // Declare variables
        double num1; // The first operand
        double num2; // The second operand
        String operator; // The operator or function
        double result; // The result of the operation or function
        char choice; // The user's choice to continue or exit
        
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        
        // Use a do-while loop to repeat the process until the user wants to exit
        do {
            // Get the first operand from the user
            System.out.print("Enter the first number: ");
            num1 = sc.nextDouble();
            
            // Get the operator or function from the user
            System.out.print("Enter the operator or function (+, -, *, /, ^, sqrt, sin, cos, tan, log): ");
            operator = sc.next();
            
            // Get the second operand from the user if needed
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("^")) {
                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();
            } else {
                num2 = 0; // Assign a dummy value
            }
            
            // Perform the appropriate operation or function based on the operator
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                        continue; // Skip the rest of the loop iteration
                    }
                    result = num1 / num2;
                    break;
                case "^":
                    result = Math.pow(num1, num2);
                    break;
                case "sqrt":
                    if (num1 < 0) {
                        System.out.println("Cannot take square root of negative number.");
                        continue; // Skip the rest of the loop iteration
                    }
                    result = Math.sqrt(num1);
                    break;
                case "sin":
                    result = Math.sin(num1);
                    break;
                case "cos":
                    result = Math.cos(num1);
                    break;
                case "tan":
                    result = Math.tan(num1);
                    break;
                case "log":
                    if (num1 <= 0) {
                        System.out.println("Cannot take logarithm of zero or negative number.");
                        continue; // Skip the rest of the loop iteration
                    }
                    result = Math.log10(num1);
                    break;
                default:
                    // Invalid operator or function
                    System.out.println("Invalid operator or function.");
                    continue; // Skip the rest of the loop iteration
            }
            
            // Display the result with proper formatting
            System.out.printf("%s %s %s = %.2f\n", num1, operator, num2 == 0 ? "" : num2, result);
            
            // Ask the user if they want to continue or exit
            System.out.print("Do you want to continue (y/n)? ");
            choice = sc.next().charAt(0);
            
        } while (choice == 'y' || choice == 'Y');
        
        // Close the Scanner object
        sc.close();
        
    }
}
