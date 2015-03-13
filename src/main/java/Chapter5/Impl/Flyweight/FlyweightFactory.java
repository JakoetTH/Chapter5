package Chapter5.Impl.Flyweight;

public class FlyweightFactory implements AircraftCommand{
    private static FlyweightFactory flyweight;
    private FlyweightFactory()
    {

    }
    public static FlyweightFactory getInstance()
    {
        if(flyweight==null)
        {
            flyweight = new FlyweightFactory();
        }
        return flyweight;
    }
    @Override
    public String Command()
    {
        return "Taking off";
    }
}
