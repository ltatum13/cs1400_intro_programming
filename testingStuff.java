public class testingStuff
{
    public static void main(String[] args)
    {
        // variables
        String s = "world";
        String t = "wander";
        String v = "hello";

        // boolean testing
        if (s==t)
        {
            System.out.println("true");
            System.out.println(s.charAt(4));
            System.out.println(s.compareTo(t));
        }
        /*
         * else if (s==v)
            System.out.println(v.toLowerCase());
         */
        
        else
        {
            System.out.println("false");
            System.out.println(t.toUpperCase());
            System.out.println(v);
        }

        /*
        switch (number)
        {
            case 1:
                System.out.println(number);
                break;
            case 2:
                System.out.println(number);
                break;
            default:
                System.out.println(number);
        }

        */
    }
}