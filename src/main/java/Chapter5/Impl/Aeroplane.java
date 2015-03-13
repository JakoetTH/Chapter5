package Chapter5.Impl;

/**
 * Created by student on 2015/03/13.
 */
public class Aeroplane implements CloneObject {
    private String name;
    public Aeroplane(String name)
    {
        this.name = name;
    }
    @Override
    public CloneObject makeCopy()
    {
        return new Aeroplane("This is an Aeroplane");
    }
    @Override
    public String getName()
    {
        return this.name;
    }
}
