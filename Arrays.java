/*
 Making an Array of Integers

First we are only going to create a reference (or declaring) to an array of integers
int[] numbers;

 Now to initialize the array
numbers = new int[5]; //This makes an array of 5 integers which are all 0 by default

We can also declare and initialize the array in one line
int[] numbers = {1,2,3,4,5}; //This creates an array of 5 integers with the values 1,2,3,4 and 5

Now to access the elements in the array we can use the index which starts at 0
System.out.println(numbers[0]); //This will pring 1 which is the first element in the array

Now if we want to change a value in the array we can do it like this
int[2] = 10;   //This will change the third element in the array to 10

This is a for loop that runs through the whole array

for(int i = 0 ; i < numbers.length; i++) {
    System.out.println(numbers[i])
}

This is an enchanced for loop:
for(int nums : number) {
    System.out.println(nums);
}
*/