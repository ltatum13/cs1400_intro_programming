public class Superhero
{
    private String name;
    private String catchPhrase;
    private String superPower;

    public Superhero(String inputName, String inputPowers, String inputPhrase)
    {
        name = inputName;
        catchPhrase = inputPhrase;
        superPower = inputPowers;
    }
    
    public void setName(String inputName)
    {
        name = inputName;
    }

    public void setPowers(String inputPowers)
    {
        superPower = inputPowers;
    }

    public void setPhrase(String inputPhrase)
    {
        catchPhrase = inputPhrase;
    }
    
    public String getName()
    {
        return name;
    }

    public String getPowers()
    {
        return superPower;
    }

    public String getPhrase()
    {
        return catchPhrase;
    }

    public void speak()
    {
        System.out.println(catchPhrase);
    }

}