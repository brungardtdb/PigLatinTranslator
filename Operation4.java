/********************
Operation4.java
Author: David Brungardt

This program invites the user to play a game where
the user enters any given word into the program and
the program will translate that word into Pig-Latin
until the user decides to quit.
*********************/
import java.util.Scanner;

public class Operation4
{
  public static void main(String[] args)
  {
    // create new instance of scanner to get user input
    Scanner scnr = new Scanner(System.in);

    // instantiate variables for game
    String userWord;
    String pigLatin;

    // welcome user to Pig-Latin translator game
    System.out.println("\nWelcome to the Pig-Latin translator!!!");

    // prompt user for input
    System.out.print("\nPlease enter a word: ");

    // assign user input to variable
    userWord = scnr.next();

    // pass string into PigLatin class constructor
    PigLatin FirstPigLatin = new PigLatin(userWord);
    // use ReturnPigLatin method to print word in pigLatin
    pigLatin = FirstPigLatin.ReturnPigLatin();
    System.out.println(pigLatin);

    do
    {
      // prompt user to enter another word or quit game
      System.out.print("\nEnter another word to be translated (or press \"Q\" to quit): ");

      // assign user input to variable
      userWord = scnr.next();

      // if user wishes to continue
      if (!userWord.equals("Q"))
      {
        // pass string into PigLatin class constructor
        PigLatin NextPigLatin = new PigLatin(userWord);
        // use ReturnPigLatin method to print word in pigLatin
        pigLatin = NextPigLatin.ReturnPigLatin();
        System.out.println(pigLatin);
      }

    } while (!userWord.equals("Q")); // end of do-while loop

  } // end of main method

} // end of Operation4 class
