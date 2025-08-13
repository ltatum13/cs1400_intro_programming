public class ArrayUtility
{
    public static void rotateLeft(int[] a)
    {
        //rotate any 1D array so that the first element is moved to the rear and the other elements have been shifted forward
        int[] a2 = new int[a.length];
        a2[a.length - 1] = a[0];
        for (int i = 1; i < a.length; i++)
        {
            System.out.print(a2[i - 1] = a[i]);
            System.out.print(" ");
        }

        System.out.print(a2[a.length - 1]);
    }

    public static void rotateLeft(int[][] a)
    {
        //rotate every row of a 2D array in the above fashion
        int[][] arr2 = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++)
        {
            arr2[i] = new int [a[i].length];
            arr2[i][a[i].length - 1] = a[i][0];
            for(int j = 1; j < a[i].length; j++)
            {
                System.out.print(arr2[i][j - 1] = a[i][j]);
                System.out.print(" ");
            }

            System.out.println(arr2[i][a[i].length - 1]);
        }
    }
}