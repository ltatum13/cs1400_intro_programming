// Laila Tatum
// CS 1400
// Assignment 2
// 2/19/2024

import java.util.Scanner;

public class TaskD
{
  public static void main(String[] args) 
  {
    // variables
    int position;
    
    // create Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);

    // ask user for numbers between 1 and 3
    System.out.print("Enter 1, 2, or 3: ");
    position = keyboard.nextInt();

    // switch statement
    switch (position)
    {
      case 1:
        System.out.println("You won!");
        break;
	    case 2:
        System.out.println("You were so close!");
        break;
      case 3:
        System.out.println("You were so close!");
        break;
	    default:
        System.out.println("Time to train harder!");
    }

    // close keyboard
    keyboard.close();
	
  }
}