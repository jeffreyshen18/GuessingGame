/*
Authors: Jacky Tang, Jeffrey Shen, Chris Selinger, Cody Clark
Date Created: Jan 18, 2017
Date Last Modified: Jan 25, 2017
Lecture: L01

This program generates a random number, and then asks the user to guess a number
The numbers are integers between 0-9
The generated number is displayed on the screen first (Mostly for testing purposes)
After the user has entered their number it will tell them whether it was too high, low, or correct.
If the user enters anything else besides an integer 0-9 it will display an error message.
*/

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        boolean isSingleDigit = false;

        // Generate and print a random number
        int number = generator.nextInt(10);
        // System.out.println(number);

        System.out.println("I'm thinking of a number between 0 and 9.");
        // while loop continously reprompts user for input until valid input is given
        while (!isSingleDigit) {
        System.out.print("What is your guess? ");
          //prompt user for input
          String guess = keyboard.nextLine();
          int length =  guess.length();

          if (length ==1) {
            char digit = guess.charAt(0);
            if (Character.isDigit(digit)) {
              //Compare digit represeneted by "digit" with digit represented by "number"
              if (digit == number + '0') {
                System.out.println("You picked the correct number!");
                isSingleDigit = true;
              } else if (digit <= number + '0') {
                System.out.println("Too low");
                System.out.print("Try again: ");
              } else if (digit >= number + '0') {
                System.out.println("Too high");
                System.out.print("Try again: ");
              }
            } else {
              //Reprompts user for input if incorrect input was entered
              System.out.print("Invalid input. ");
            }
            // Reprompts user for input if incorrect input was entered
          } else {
            System.out.print("Invalid input. ");
          }
        }
      }
}
