// Laila Tatum
// CS 1400
// Assignment 2
// 2/19/2024

import java.util.Scanner;

public class TaskA
{
    public static void main(String[] args)
    {
        // scanner
        Scanner keyboard = new Scanner(System.in);

        // ask user for ability scores
        System.out.print("Enter ability 1 score: ");
        int scoreOne = keyboard.nextInt();

        System.out.print("Enter ability 2 score: ");
        int scoreTwo = keyboard.nextInt();

        System.out.print("Enter ability 3 score: ");
        int scoreThree = keyboard.nextInt();

        System.out.print("Enter ability 4 score: ");
        int scoreFour = keyboard.nextInt();

        System.out.print("Enter ability 5 score: ");
        int scoreFive = keyboard.nextInt();

        // ability scores printed
        System.out.print("Ability Score 1: ");
        abilityScores(scoreOne);

        System.out.print("Ability Score 2: ");
        abilityScores(scoreTwo);

        System.out.print("Ability Score 3: ");
        abilityScores(scoreThree);

        System.out.print("Ability Score 4: ");
        abilityScores(scoreFour);

        System.out.print("Ability Score 5: ");
        abilityScores(scoreFive);

        // close keyboard
        keyboard.close();
    }

    // abilityScores takes user input and prints the crowd graph
    public static void abilityScores(int scores)
    {
        for (int i = 1; i <= scores/10; i++)
        {
            System.out.print("\\o/");
        }

        System.out.println("");
    }
}