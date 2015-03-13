package Chapter5.Impl;

/**
 * Created by student on 2015/03/13.
 */
public class PrototypeHelicopter implements CloneObject {
    private String name;
    public PrototypeHelicopter(String name)
    {
        this.name = name;
    }
    @Override
    public CloneObject makeCopy()
    {
        return new PrototypeHelicopter("This is a Helicopter");
    }
    @Override
    public String getName()
    {
        return this.name;
    }
}
