// Laila Tatum
// CS 1400
// Assignment 5
// 21 April 2025

public class Recursion
{
    public static void main(String[] args)
    {
        // Task A Demo
        System.out.println(sum(50));
        
        // Task C Demo
        int[] testARR = {0, 2, 6, 4, 3, 3, 2, 0, 3, 6, 0, 7, 3};
        System.out.println(numberCount(testARR, 5));

        // Task D Demo
        System.out.println(multiply(10, 12));

        // Task B Demo
        reverseString("Hello World");
    }

    // Task A
    public static int sum(int num)
    {
        if (num <= 0)
        {
            return 0;
        }
        else
        {
            return num + sum(num-1);
        }
    }

    // Task B
    public static void reverseString(String word)
    {
        if (word.length() == 1)
	    {
	        System.out.print(word);
	    }
	    else
	    {
	        reverseString(word.substring(1));
	        System.out.print(word.charAt(0));
	    }
    }

    // Task C
    public static int numberCount(int[] arr, int num)
    {
        int count = 0;
        
        if (arr.length > 0)
        {
            int value = arr[0];
            int arr2[] = new int [arr.length - 1];

            if (value == num)
            {
                count++;
            }

            for (int i = 1; i < arr.length; i++)
            {
                arr2[i - 1] = arr[i];
            }
             
            return count + numberCount(arr2, num);
        }
             
        else
        {
            return 0;
        } 
    }

    // Task D
    public static int multiply(int x, int y)
    {
        if (x == 0 || y == 0)
        {
            return 0;
        }
        else
        {
            return x + multiply(x, y-1);
        }
    }
}