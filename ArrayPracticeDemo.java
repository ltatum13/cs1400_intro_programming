public class ArrayPracticeDemo
{
    public static void main(String[] args)
    {
        int[][] demoARR = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        ArrayPractice a1 = new ArrayPractice();

        System.out.println(a1.getTotal(demoARR));
        System.out.println(a1.getAverage(demoARR));
        System.out.println(a1.getRowTotal(demoARR, 1));
        System.out.println(a1.getColumnTotal(demoARR, 3));
        System.out.println(a1.getHighestInRow(demoARR, 1));
        System.out.println(a1.getLowestInRow(demoARR, 1));
    }
}