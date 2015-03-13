package Chapter5.Impl.Composite;


public class Aeroplane implements Component {
    String name;
    public Aeroplane(String name)
    {
        this.name = name;
    }
    @Override
    public String fly()
    {
        return "I am flying";
    }
    @Override
    public String land()
    {
        return "I am landing";
    }
}
