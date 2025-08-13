// Laila Tatum
// CS 1400
// Assignment 4
// 16 April 2025

public class Demo
{
    public static void main(String[] args)
    {
        try
        {
            Person p1 = new Person("Bob", 10, "pancakes");
            System.out.println(p1.toString());

            Person p2 = new Person(p1);
            System.out.println(p2.toString());
            System.out.println(p2.equals(p1));

        }
        catch(Exception e)
        {
            System.out.println(e);
        }


        try
        {
            SuperHero s1 = new SuperHero("Kyle", 10, "burgers",
            "Super Why", "the power to read", "Who's "
                + "got the power? The power to read!");
            SuperHero s2 = new SuperHero("Laura", 10, "pesto",
            "Princess Pea", "spelling power", "Peas "
                + "and carrots, carrots and peas");
            
            s1.speak();
            s2.speak();

            System.out.println(s1.toString());
            System.out.println(s2.toString());

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        try
        {
            SuperHero.catchVillain(5);
        }
        catch(SuperHeroExhaustion e)
        {
            System.out.println(e);
        }

        System.out.println("Villains caught: " + SuperHero.villainsCaught());
    
    }
}