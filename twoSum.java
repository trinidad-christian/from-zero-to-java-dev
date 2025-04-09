/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/
import java.util.Scanner;


public class twoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            //Stores a target number that is given from the user in an local variable
            System.out.print("Give me a target number. ");
            int target = scan.nextInt();

            //Asks the user how long they want the array to be
            System.out.println("How long do you want the array to be? (It has to be at least 2 numebers please don't make it too long):");
            int nums_length = scan.nextInt();

            //Store a user given array using a for loop in another local variable
            int[] numbers = new int[nums_length];

            for(int i= 0; i < numbers.length ; i++) {
                System.out.println("Give me a new number for the array element : " + (i + 1 ));
                numbers[i] = scan.nextInt();
            }

            //Now we will begin trying to find the needed tow indexes that add up to target

             for(int i= 0; i < numbers.length ; i++) {
                for(int i = numbers.length -1 ; i < 0 ; i--) {
                    
                }
             }
        

        scan.close(); //Closes the user input scanner object so we can avoid a resource leak.
    }
}
