public class superHeroWorld
{
    public static void main(String[] args)
    {
        Superhero s1 = new Superhero("Question Mark", "the power to answer any question", "I don't even know!");
        s1.getName();
        s1.getPhrase();
        s1.getPowers();
        s1.speak();

        s1.setName("Anon Mask");
        s1.setPhrase("I may have the answer, but we'll never know!");
        s1.setPowers("the power to confuse people against their will");
        s1.speak();

        Superhero s2 = new Superhero("Exclamation Mark", "the power to exclaim loudly", "I know!");
        s2.getName();
        s2.getPhrase();
        s2.getPowers();
        s2.speak();

        s2.setName("Exclaimer");
        s2.setPhrase("I'm the better yeller!");
        s2.setPowers("the power to yell even louder");
        s2.speak();
    }
}