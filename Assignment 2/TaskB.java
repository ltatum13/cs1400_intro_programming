// Laila Tatum
// CS 1400
// Assignment 2
// 2/19/2024

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TaskB
{
  public static void main(String[] args) throws IOException
  {
    // scanner
    Scanner keyboard = new Scanner(System.in);

    // ask user for number between 1-5
    System.out.print("Please enter a number between 1 and 5: ");
    int userNum = keyboard.nextInt();

    // open file
    File myFile = new File("Excuses.txt");
    Scanner inputFile = new Scanner(myFile);

    // look through excuses based on user number
    for (int i = 0; i < userNum; i++)
    {
      String str = inputFile.nextLine();
      
      if (i == (userNum - 1)) // when i gets to the specific line number, print the excuse
      {
        System.out.print("I could not do my homework because ");
        System.out.println(str);
      }
    }

    // close keyboard and file
    keyboard.close();
    inputFile.close();
  }
}