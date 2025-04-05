/* Write a Java program that finds the largest number in an array.

Example Input:
int[] numbers = {3, 7, 2, 9, 5};
Expected Output:
The maximum number is: 9
*/

public class largestNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 5};

//Before line 12 it's everything we are given in the problem

        int largest = 0;

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
        }
        System.out.print(largest);
    }
}


