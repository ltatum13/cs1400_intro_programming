// use extends to ensure the subclass inherits the methods and fields of the superclass
public class FighterMinion extends Minion
{
    private String superPower;
    private String weapon;

    public void setPower(String p)
    {
        superPower = p;
    }

    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
    }
}