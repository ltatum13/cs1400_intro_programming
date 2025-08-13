public class FibonacciSeries
{
    public static void main(String[] args)
    {
        System.out.println(fib(17));
    }

    public static int fib(int n)
    {
        if (n == 0) // f(0) = 0
        {
            return 0;
        }
        else if (n == 1) // f(1) = 1
        {
            return 1;
        }
        else // f(n) = f(n-1) + f(n-2)
        {
            return fib(n-1) + fib(n-2);
        }
    }
}