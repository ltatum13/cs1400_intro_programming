import java.util.ArrayList; // importing ArrayList

public class ArraysAndArrayLists
{
    public static void main(String args[])
    {
        // different ways to initialize arrays
        final int EMPLOYEES = 5;
        char[] letters = new char[EMPLOYEES];
        String[] names = new String[4];
        double numbers[] = new double[5];
        int[] numARRAY = {30, 24, 37, 56, 77, 89};
        int[] newNum = new int[6];
        char[] letters2 = {'j', 'k', 'l', 'm', 'n'};
        int highest = numARRAY[0];

        // creating an ArrayList
        // can only contain objects (no int, double, etc)
        ArrayList<String> nameList = new ArrayList<>();

        // accessing ArrayLists
        nameList.add(0, "Chicken");
        nameList.add(1, "Peas");
        System.out.println(nameList.size());
        System.out.println(nameList.get(0));
        System.out.println(nameList);

        nameList.remove(1);
        System.out.println(nameList.size());
        System.out.println(nameList.get(0));
        System.out.println(nameList);

        // for loops accessing arrays
        for(int i = 0; i < letters.length; i++) // common to use length method to update with changes in array size
        {
            letters[i] = letters2[i];
            System.out.println(letters[i]);
        }

        // transfer numARRAY items to newNum
        for(int j = 0; j < numARRAY.length; j++)
        {
            newNum[j] = numARRAY[j];
        }

        // finding the greatest number in numARRAY
        // print the greatest number
        for(int n = 0; n < numARRAY.length; n++)
        {
            if (numARRAY[n] > highest)
            {
                highest = numARRAY[n];
            }
        }

        System.out.println("the highest number is: " + highest);

        // enhanced for loop for arrays
        for(int val : numARRAY)
        {
            System.out.println(val);
        }

        // using the length method on arrays
        System.out.println("the letters array is " + letters.length + " long");
        System.out.println(numbers); // prints the address of the array

        // how to access array elements
        System.out.println(letters[2]);
        System.out.println(names[3]);
        System.out.println(numbers[0]);
        System.out.println(numARRAY[4]);

        // 2D array
        int[][] twoDARRAY = new int[3][4];

        // ragged array

        // setting array items to a value
        twoDARRAY[1][1] = 5;
        twoDARRAY[0][2] = 6;

        // accessing array elements
        System.out.println("element 1x1: " + twoDARRAY[1][1]);
        System.out.println(twoDARRAY);

    }
}