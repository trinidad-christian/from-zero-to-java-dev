import java.util.Scanner;

public class calculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome to Trinidad's calculator what's your name?");
        String name = scan.nextLine(); // Scans the name (String) and stores it (add to notes)
        //Gets the operations the user whats to do and the numbers
        System.out.println("Hello, " + name + " what operations are you going to do today?")
        



        scan.close();
    }
}
