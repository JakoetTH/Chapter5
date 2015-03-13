package Chapter5.Impl;

/**
 * Created by student on 2015/03/13.
 */
public class Helicopter implements CloneObject {
    private String name;
    public Helicopter(String name)
    {
        this.name = name;
    }
    @Override
    public CloneObject makeCopy()
    {
        return new Helicopter("This is a Helicopter");
    }
    @Override
    public String getName()
    {
        return this.name;
    }
}
