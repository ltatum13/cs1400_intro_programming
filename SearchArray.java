public class SearchArray
{
    public static void main(String[] args)
    {
        int[] arr = {3, 1, 7, 2, 4, 8};
        System.out.println(sequentialSearch(arr, 7));
        selectionSort(arr);
    }

    public static int sequentialSearch(int[] a, int v)
    {
       // variables
       int index = 0; // loop control variable
       int element = -1; // index where value is found
       boolean found = false; // flag indicating search results

       // while loop
       // search array while the value isn't found and the index hasn't passed the bounds of the array
       while (!found && index < a.length)
       {
        if (a[index] == v) // once the v
        {
            found = true;
            element = index;
        }
        
        index++;
       }

       return element;
    }

    public static void selectionSort(int[] a)
    {
        int[] newA = new int[a.length];
        int lowestNum = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < lowestNum)
            {
                newA[i] = a[i];
            }

            else
            {
                newA[i] = a[i];
            }

            System.out.print(newA[i] + " ");
        }
    }
}