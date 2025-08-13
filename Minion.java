
public class Minion
{
    // fields are listed first; you can have the fields public,
    // but it's not encouraged
    public int numEyes;
    private int height;
    private String name;

    // static variables are shared across objects in the class
    // they're not exclusive to an instance
    private static int numMinions;
    private static int numBananas;

    // constructor; have the same name as the class, are public,
    // don't need a return type, and don't return values
    public Minion(int inputEyes, int inputHeight, String inputName)
    {
        numEyes = inputEyes;
        height = inputHeight;
        name = null;
        numMinions++;

        System.out.println("I'm alive!");
    }

    // there are multiple constructors with the same name
    // this is an example of constructor overload
    // constructors can call other constructors
    public Minion()
    {
        numEyes = 1;
        name = null;
    }


    // copy constructor
    public Minion(Minion inputMinion)
    {
        numEyes = inputMinion.getNumEyes();
        name = inputMinion.getName();
        height = inputMinion.getHeight(); 
    }

    // methods are listed next; have the fields private
    // and the methods public
    public void setNumEyes(int numEyes)
    {
        // the this reference refers to the object's instance variable
        // so, you don't have to change the method field name
        this.numEyes = numEyes;
    }

    public void setHeight(int inputHeight)
    {
        height = inputHeight;
    }

    public void setName(String inputName)
    {
        name = inputName;
    }

    public void sayYourName()
    {
        System.out.println("My name is " + name);
    }

    public int getNumEyes()
    {
        return numEyes;
    }

    public int getHeight()
    {
        return height;
    }

    public String getName()
    {
        return name;
    }

    public String getDataSheet()
    {
        return "Data: " + numEyes + ", " + name;
    }

    // you can't access a non-static field in a static method
    // but you can access static fields in non-static methods
    public static void minionCelebration()
    {
        System.out.println("Minions celebrate by saying meh!");
    }

    public static int getNumMinions()
    {
        return numMinions;
    }

    public static void collectBananas()
    {
        numBananas++;
    }

    public static void eatBananas()
    {
        numBananas--;
    }

    public static int bananaCount()
    {
        return numBananas;
    }

    public String toString()
    {
        String output = name + ", " + numEyes;
        return output;
    }

    public boolean equals(Minion inputMinion)
    {
        if ((numEyes == inputMinion.getNumEyes()) && (name == inputMinion.getName()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void finalize()
    {
        System.out.println("bye, bye!");
    }

}