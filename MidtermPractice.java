// imports
import java.util.ArrayList;
import java.lang.String;
import java.util.Scanner;

public class MidtermPractice
{
    public static void main(String[] args)
    {
        // variables
        int x = 0;
        double d = 0.0;
        float f = 0;
        boolean bool = true;
        byte by = 0;
        long l = 0;
        String s = new String("hello world");
        char c = 'k';

        // arrays and array lists
        int[] a = new int[3];
        int[][] a2 = new int[3][3];
        ArrayList<String> aL = new ArrayList<String>();
        aL.add("hello");
        aL.add("world");

        // scanner class/user input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input a random integer: ");
        x = keyboard.nextInt();

        System.out.print("Input a random integer: ");
        d = keyboard.nextDouble();

        System.out.print("Input a random integer: ");
        f = keyboard.nextFloat();

        System.out.print("Input true or false: ");
        bool = keyboard.nextBoolean();

        System.out.print("Input a random integer: ");
        by = keyboard.nextByte();

        System.out.print("Input a random integer: ");
        l = keyboard.nextLong();

        System.out.print("Input a random word/s: ");
        s = keyboard.nextLine();

        System.out.print("Input a random letter: ");
        c = keyboard.next().charAt(0);

        // close Scanner
        keyboard.close();

        // for loop
        for (int i = 0; i < 10; i++)
        {
            x++;
            d++;
            l++;
            f++;
            by++;
        }

        // enhanced for loop
        for (int e : a)
        {
            System.out.println(e);
        }

        for (int[] n : a2)
        {
            for(int k : n)
            {
                System.out.println(k);
            }
        }

        // while loop
        while ((d < 10 && by < 10) == bool)
        {
            System.out.println(x++);
        }

        // do while loop
        do
        {
            System.out.println("longggggg");
        }
        while (l < 10 && f < 10);

        // if statement
        if (s == "hello")
        {
            System.out.println(s);
        }

        else if (s == "world")
        {
            System.out.println(s);
        }

        else
        {
            System.out.println("Not the words we're looking for!");
        }

        // switch case
        switch (c)
        {
            case 'v':
                System.out.println("c = " + c);
                break;

            default:
                System.out.println("Not the letter we're looking for!");
        }

        // file handling

    }

    // function
}