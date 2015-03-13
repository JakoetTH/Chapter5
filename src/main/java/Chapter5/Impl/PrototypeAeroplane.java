package Chapter5.Impl;

/**
 * Created by student on 2015/03/13.
 */
public class PrototypeAeroplane implements CloneObject {
    private String name;
    public PrototypeAeroplane(String name)
    {
        this.name = name;
    }
    @Override
    public CloneObject makeCopy()
    {
        return new PrototypeAeroplane("This is an Aeroplane");
    }
    @Override
    public String getName()
    {
        return this.name;
    }
}
