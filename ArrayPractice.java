public class ArrayPractice
{
    public int getTotal(int arr[][])
    {
        int arrtotal = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arrtotal = arrtotal + arr[i][j];
            }
        }

        return arrtotal;
    }

    public float getAverage(int[][] arr)
    {
        int arrSUM = getTotal(arr);
        float arrCOUNT = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                arrCOUNT++;
            }
        }

        return arrSUM / arrCOUNT;
    }

    public int getRowTotal(int[][] arr, int sub)
    {
        int rowTotal = 0;
        for (int i = 0; i < arr[sub].length; i++)
        {
            rowTotal = rowTotal + arr[sub][i];
        }
        
        return rowTotal;
    }
    
    public int getColumnTotal(int[][] arr, int sub)
    {
        int colTotal = 0;
        for (int i = 0; i < arr.length; i++)
        {
            colTotal = colTotal + arr[i][sub];
        }
        
        return colTotal;
    }

    public int getHighestInRow(int[][] arr, int sub)
    {
        int rowMAX = 0;
        for (int i = 0; i < arr[sub].length; i++)
        {
            if (arr[sub][i] > rowMAX)
            {
                rowMAX = arr[sub][i];
            }
        }
        
        return rowMAX;
    }

    public int getLowestInRow(int[][] arr, int sub)
    {
        int rowMIN = arr[sub][0];
        for (int i = 0; i < arr[sub].length; i++)
        {
            if (arr[sub][i] < rowMIN)
            {
                rowMIN = arr[sub][i];
            }
        }
        
        return rowMIN;
    }

}