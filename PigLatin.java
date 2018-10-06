/********************
PigLatin.java
Author: David Brungardt

Class used by Operation4 program to translated
words into Pig-Latin
*********************/

public class PigLatin
{
  // initialize fields for pigLatin class
  String userInput;
  String pigLatin;
  int i;

  // property for userInput
  public String getUserInput()
  {
    return this.userInput;
  }
  public void setUserInput(String value)
  {
    this.userInput = value;
  }

  // property for pigLatin
  public String getPigLatin()
  {
    return this.pigLatin;
  }
  public void setPigLatin(String value)
  {
    this.pigLatin = value;
  }

  // constructor for PigLatin class
  PigLatin(String inputString)
  {
    this.setUserInput(inputString.toLowerCase());

    // check to see if word starts with vowel
    if(this.userInput.charAt(0) == 'a' || this.userInput.charAt(0) == 'e' || this.userInput.charAt(0) == 'i' || this.userInput.charAt(0) == 'o' || this.userInput.charAt(0) == 'u')
    {
      // add "way" to end of String
      this.setPigLatin(this.userInput.concat("way"));
    }
    else // if word doesn't start with a vowel
    {
      // boolean value to change strings
      boolean isVowel = false;
      // intermediate String variables
      String intermediateString = "";
      String pigLatinTemp = "";

      // loop through characters in string and check for vowels
      for (i = 0; i < inputString.length(); i++)
      {
        // check each character in string to see if it's a vowel
        if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i' || inputString.charAt(i) == 'o' || inputString.charAt(i) == 'u')
        {
          // if character is a vowel, set boolean to true
          isVowel = true;
        }

        // while boolean is false (character is not a vowel), add characters to intermediateString
        if (!isVowel)
        {
          intermediateString = intermediateString + this.userInput.charAt(i);
        }
        else // when boolean is true (character is a vowel) add value to second intermediateString
        {
          pigLatinTemp = pigLatinTemp + this.userInput.charAt(i);
        }

      } // end of for-loop

      // put string starting with vowel first, then add second intermediate string, then add 'way' to end of string
      this.setPigLatin(pigLatinTemp + intermediateString + "ay");

    } // end of if-else

  } // end of constructor

  // method to return string value of word in pig PigLatin
  public String ReturnPigLatin()
  {
    // return pigLatin string so it can be printed in program
    return pigLatin;
  } // end of ReturnPigLatin method

} // end of pigLatin class
