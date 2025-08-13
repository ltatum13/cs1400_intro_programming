// Laila Tatum
// CS1400
// Assignment 1
// 3 February 2025

import java.util.Scanner;

public class TaskC
{
    public static void main(String[] args)
    {
        // variables
        double degreesC;
        double degreesF;

        // scanner
        Scanner keyboard = new Scanner(System.in);

        // ask user for degrees celcius
        System.out.print("Please enter a temperature in Celsius: ");
        degreesC = keyboard.nextDouble();

        //calculate fahrenheit
        degreesF = degreesC * 9.0/5.0 + 32.0;

        // print results
        System.out.println(degreesC + " degrees Celsius is equal to " + degreesF + " degrees Fahrenheit.");

        keyboard.close();
    }
    
}
