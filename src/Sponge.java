public class Sponge {

  /*
   * Create a method "spongeCase" that takes a string consisting of one or more words 
   * separated by spaces. It should return a new string converted to "sponge 
   * case," where each word starts with a lowercase letter, and then alternates 
   * between upper and lower case for each following letter in the word.
   *
   * Examples:
   *
   * spongeCase("spongebob")  should return "sPoNgEbOb"
   * spongeCase("Who are YOU calling A Pinhead")  should return "wHo aRe yOu cAlLiNg a pInHeAd"
   * spongeCase("WHAT is UP my dude")  should return "wHaT iS uP mY dUdE"
   * spongeCase("debí tirar más fotos") should return dEbÍ tIrAr mÁs fOtOs" (note the accents)
   * spongeCase("E")  should return "e"
   * spongeCase("e")  should return "e"
   * 
   * Hints:
   * There exist the following methods in java:
   * Character.toUpperCase() (e.g. Character.toUpperCase('f'))
   * Character.toLowerCase() (e.g. Character.toLowerCase('Q'))
   * .toCharArray() String method (e.g. myString.toCharArray())
   */
  public static void main(String[] args) {
    // Test cases
    assertEqual(1, spongeCase("spongebob"), "sPoNgEbOb");
    assertEqual(2, spongeCase("Who are YOU calling A Pinhead"), "wHo aRe yOu cAlLiNg a pInHeAd");
    assertEqual(3, spongeCase("WHAT is UP my dude"), "wHaT iS uP mY dUdE");
    assertEqual(4, spongeCase("debí tirar más fotos"), "dEbÍ tIrAr mÁs fOtOs");
    assertEqual(5, spongeCase("E"), "e");
    assertEqual(6, spongeCase("e"), "e");
  }

  // Implement your solution here!
  public static String spongeCase(String sentence) {
    // first need an empty string 
    //To split the sentence in to words
    //Lets take the word and the result will have word sseperaded by space
    //For loop to take each character and check if starts with lower case to upper case
   
   // Create a stringbuilder for the final result
    StringBuilder result = new StringBuilder();

    //Split the sentence into words
    String[] words = sentence.split(" ");

    // Loop through each word
    for (int i = 0; i < words.length; i++){
      String word = words[i];
      StringBuilder spongeWord = new StringBuilder();

      //convert the word into a char array to process each character
      char[] chars = word.toCharArray();

      //Alternate between lower and upper case

       for (int j = 0; j < chars.length; j++) {
        char currentChar = chars[j];

        // Even index → lowercase, Odd index → uppercase
        if (j % 2 == 0) {
          spongeWord.append(Character.toLowerCase(currentChar));
        } else {
          spongeWord.append(Character.toUpperCase(currentChar));
        }
      }

      // Append the processed word to the result
      result.append(spongeWord);

      // Add a space after each word except the last one
      if (i < words.length - 1) {
        result.append(" ");

    }
  }

    // Return the final sponge case string
    return result.toString();

  }


  // Method to help with testing, you do not need to read this.
  public static void assertEqual(int testNumber, String actual, String expected) {
    if (!expected.equals(actual)) {
      System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
    } else {
      System.out.println("Test " + testNumber + " passed!");
    }
  }
}