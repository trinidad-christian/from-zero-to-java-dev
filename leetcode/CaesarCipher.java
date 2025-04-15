public class CaesarCipher
{

  /** Returns an encoded version of msg by applying a Caesar
   *  Cipher with a shift specified by the parameter shift.
   *  Preconditions: msg contains only upper case letter
   *  characters, shift is greater than or equal to 0
   */
  public static String encode(String msg, int shift)
  {
    //This method is the only one we need to change and are trying to fix
    //msg is a string full of CAPITAL LETTERS
    //We need to change every letter in msg by the shift
    
    //we first need to make sure we go through all the msg and apply the shift
    
    String final_string= "";
    for(int i = 0; i< msg.length() ; i++) {
      //we take every msg letter and add shift
      String current_letter = "" + msg.charAt(i); 
      int num_letter = letterToNum(current_letter);
      num_letter = (num_letter + shift ) % 26;
      current_letter = numToLetter(num_letter);
      
      final_string += current_letter;
      
    
      
    }
    return final_string;
}

  /** Returns the number representing the position of letter in the
   *  alphabet, where A is at position 0, Z  is at position 25
   *  Precondition: letter is a String containing one uppercase
   *  letter character only.
   */
  private static int letterToNum(String letter)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    char l = '?';
    if(letter.length()==1) l = letter.charAt(0);
    if(!Character.isUpperCase(l)) return -1;
    return (int) l - 65;
  }

  /** Returns a String consisting of the single upper case letter which
   *  is at the position num in the alphabet, where A is at position 0,
   *  Z is at position 25
   *  Precondition: num is between 0 and 25 inclusive
   */
  private static String numToLetter(int num)
  {
    /* COMPLETE WORKING METHOD PROVIDED */
    /* DO NOT MODIFY THE IMPLEMENTATION OF THIS METHOD*/
    if(num < 0 || num > 26) return "?";
    return Character.toString((char)(num + 65));
  }

  /* Methods for subsequent parts of this question are not shown */

}

