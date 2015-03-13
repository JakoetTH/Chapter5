package Chapter5.Impl.Flyweight;


public class Fly implements AircraftCommand{
    @Override
    public String Command()
    {
        return "Taking off";
    }
}
