import java.util.Scanner; // for user input

public class Main {

    public static void main(String[] args) {


        
        // Task 1: Output Statements
        
        System.out.println("Hello, my name is Max.");
        System.out.println("My favorite color is cyan");
        System.out.println(); // Blank line for readability


        
        // Task 2: Comments
    
        // This is a single-line comment explaining that we are using System.out.println for output.

        /*
         * This is a multi-line comment.
         * It can span multiple lines and is useful for longer explanations.
         */


        
        // Task 3: Variables and Data Types
        
        String personName = "Simon";          // String variable to store a name
        long cityPopulation = 307465;      // long variable for population
        double temperatureCelsius = 23.5;     // double variable for temperature
        boolean isStudent = true;             // boolean variable for student status

        System.out.println("The person's name is " + personName + ".");
        System.out.println("The population of the city is " + String.format("%,d", cityPopulation));
        System.out.println("The temperature is " + temperatureCelsius + " degrees Celsius");
        System.out.println("Is the person a student? " + isStudent);
        System.out.println();


        
        // Task 4: Constants
        
        final double PI = 3.14159;   // Constant for Pi
        double radius = 17;
        double area = PI * radius * radius;

        System.out.println("The area of a circle with radius " + radius + " is " + area);
        System.out.println();


        
        // Task 5: Typecasting and if-else
        
        Scanner input = new Scanner(System.in); // Create Scanner object for user input

        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        System.out.print("Enter your age: ");
        String ageInput = input.nextLine();
        int age = Integer.parseInt(ageInput); // Typecasting string to int

        System.out.println("Hello " + userName);

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        System.out.println();



        // Task 6: Switch Statement

        System.out.print("Enter number 1: ");
        double number1 = Double.parseDouble(input.nextLine());

        System.out.print("Enter number 2: ");
        double number2 = Double.parseDouble(input.nextLine());

        System.out.println("Choose an operation:");
        System.out.println("1 = Addition");
        System.out.println("2 = Subtraction");
        System.out.println("3 = Multiplication");
        System.out.println("4 = Division");
        System.out.print("Enter your choice (1-4): ");

        int choice = Integer.parseInt(input.nextLine());
        double result = 0;

        switch (choice) {
            case 1:
                result = number1 + number2;
                System.out.println("The result of addition is " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("The result of subtraction is " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("The result of multiplication is " + result);
                break;
            case 4:
                if (number2 != 0)
                    result = number1 / number2;
                else
                    System.out.println("Division by zero is not allowed!");
                System.out.println("The result of division is " + result);
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                break;
        }

        System.out.println("\nProgram execution completed. Press Enter to exit.");
        input.nextLine(); // Wait for Enter key
        input.close();    // Close Scanner
    }
}

