import java.util.Scanner;

public class calculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome to Trinidad's calculator what's your name? ");
        String name = scan.nextLine(); // Scans the name (String) and stores it 

        //Gets the operations the user whats to do and the numbers. A lot of text.... 
        //I will try and find a way to make this more effiecient in the future.
        System.out.println("Hello, " + name + " what operation are you going to do today?" + 
        System.lineSeparator() + "1. Addition" + System.lineSeparator() + "2. Subtraction" + 
        System.lineSeparator() + "3. Multiplication" + System.lineSeparator() + 
        "4. Division" );

        //variable that is the operation the user wants to do 
        int operation = scan.nextInt();
        //variable that stores the users two numbers that should go through the operation
        System.out.println("Great, now that I know what operation you want to do can you give me the first number: ");
        Double first_number = scan.nextDouble();
        System.out.println("Now the second: ");
        Double second_number = scan.nextDouble();
        //using switch commands rather than a bunch of if and elses

        switch(operation) {
            case 1 :
                System.out.println("Calculation: " + (first_number + second_number));
                break;
            case 2 : 
                System.out.println("Caculation: " + (first_number - second_number));
                break;
            case 3: 
                System.out.println("Calculation: " + (first_number * second_number));
                break;
            case 4: 
                if (second_number ==0) {
                    System.out.println("You gave me a 0 for denominator when dividing that's not possible");
                    break;
                }
                System.out.println("Calculation: " + (first_number / second_number));

            default: 
                System.out.println("You gave me a wrong number for the operations it's either 1, 2, 3 , or 4");
                
                
        }
        scan.close();
    }
}
