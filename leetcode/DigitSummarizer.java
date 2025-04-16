public class DigitSummarizer
{

  /** Returns the single-digit "digital root" of n
   *  Precondition: n is a positive number
   */
  public static int digitalRoot(int n)
  {
    //If the int value has 2 or more digits then it runs until we have one
    int root = n;
    while (root>=10) {
      root = digitSum(root); //after this we would have 15
    }
    return root;
    
  }

  /** Returns the sum of the digits in n
   *  Precondition: n is a positive number
   */
  public static int digitSum(int n)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    int s = 0;
    while(n > 0){
      s += n%10;
      n /=10;
    }
    return s;
  }

  /* Methods for subsequent parts of this question are not shown */

}

