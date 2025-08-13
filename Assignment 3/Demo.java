// Laila Tatum
// CS 1400
// Assignment 3
// 24 March 2025

public class Demo
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Bob", 20, "pancakes");
        System.out.println(p1.toString());

        Person p2 = new Person(p1);
        System.out.println(p2.toString());
        System.out.println(p2.equals(p1));

        SuperHero s1 = new SuperHero("Kyle", 10, "burgers",
            "Super Why", "the power to read", "Who's "
            + "got the power? The power to read!");
        SuperHero s2 = new SuperHero("Laura", 10, "pesto",
            "Princess Pea", "spelling power", "Peas "
            + "and carrots, carrots and peas");

        s1.speak();
        s2.speak();

        SuperHero.catchVillain();
        System.out.println("Villains caught: " + SuperHero.villainsCaught());
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}