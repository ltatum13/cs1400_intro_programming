public class MinionDemo
{
    public static void main(String[] args)
    {
        Minion m1 = new Minion(2, 1, "Bob");
        m1.setName("Bob");
        m1.setNumEyes(2);
        m1.setHeight(1);

        Minion m2 = new Minion(1, 2, "Stuart");
        m2.setName("Dobb");
        m2.setNumEyes(1);
        m2.setHeight(2);

        Minion m3 = new Minion(1, 3, "Conn");
        m3.setName(m1.getName());
        m3.setNumEyes(m1.getNumEyes());

        Minion m4 = new Minion(m3);
        Minion m5 = new Minion(2, 1, "Susie");
        Minion m6 = new Minion(m5);

        FighterMinion m7 = new FighterMinion();
        m7.setPower("flying");
        m7.setWeapon("banana boomerang");
        m7.setName("Rambo");
        System.out.println(m7.getDataSheet());

        WorkerMinion m8 = new WorkerMinion();
        m8.setJob("accountant");
        m8.setTool("computer");
        m8.setName("Honey");
        System.out.println(m8.getNumEyes());

        m1.sayYourName();
        m2.sayYourName();
        m3.sayYourName();
        m4.sayYourName();

        /*
        int setOfEyes = m2.getNumEyes();
        System.out.println(setOfEyes);
        */

        System.out.println(m1.getDataSheet());
        changeToCuteName(m2);
        System.out.println(m1.getDataSheet());
        System.out.println(m4.getDataSheet());

        // when the fields of a class are made public,
        // you're able to access them without having to
        // access it through a method, such as setNumEyes()

        // the input variable and the internal field
        // can have the same name, but the input variable
        // overshadow the internal field and make it
        // inaccessible

        Minion.minionCelebration();

        if (Minion.getNumMinions() == 1)
        {
            // takes value from variable shared across all objects in class
            // based on the number of times an instance is made
            System.out.println("There is " + Minion.getNumMinions() + " minion");
        }

        else
        {
            System.out.println("There are " + Minion.getNumMinions() + " minions");
        }

        Minion.collectBananas();
        Minion.collectBananas();
        Minion.eatBananas();
        
        if (Minion.bananaCount() == 1)
        {
            System.out.println("There is " + Minion.bananaCount() + " banana");
        }

        else
        {
            System.out.println("There are " + Minion.bananaCount() + " bananas");
        }

        
        // toString returns information about an object such as the instance fields
        // you can manipulate the toString method to print a constant variable
        System.out.println(m2);
        System.out.println(m2.toString());

        // equals method compares object instance variables
        // and returns true or false whether both objects have
        // the same values or not
        System.out.println(m3.equals(m1));
        System.out.println(m6.equals(m5));

    }

    public static void changeToCuteName(Minion inputMinion)
    {
        String tempName = inputMinion.getName();
        tempName = tempName + "y";
        inputMinion.setName(tempName);
    }
}