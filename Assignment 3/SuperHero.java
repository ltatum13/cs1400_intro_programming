// Laila Tatum
// CS 1400
// Assignment 3
// 24 March 2025

public class SuperHero extends Person
{
    private String superheroname;
    private String superpower;
    private String catchPhrase;
    private static int totalNumberVillainsCaught;
    
    public SuperHero (String name, int age, String favFood, String heroName, String superpower, String catchPhrase)
    {
        super(name, age, favFood);
        this.superheroname = heroName;
        this.superpower = superpower;
        this.catchPhrase = catchPhrase;
    }

    public void setHeroName(String heroName)
    {
        superheroname = heroName;
    }

    public void setPower(String power)
    {
        superpower = power;
    }

    public void setPhrase(String phrase)
    {
        catchPhrase = phrase;
    }

    public String getHeroName()
    {
        return superheroname;
    }

    public String getPower()
    {
        return superpower;
    }

    public String getPhrase()
    {
        return catchPhrase;
    }

    public void speak()
    {
        System.out.println(catchPhrase);
    }

    public String toString()
    {
        String output = superheroname + ", " + superpower + ", " + catchPhrase;
        return output;
    }

    public static void catchVillain()
    {
        totalNumberVillainsCaught += 1;
    }

    public static int villainsCaught()
    {
        return totalNumberVillainsCaught;
    }
}