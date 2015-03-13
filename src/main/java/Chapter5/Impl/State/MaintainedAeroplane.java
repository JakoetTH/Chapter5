package Chapter5.Impl.State;

/**
 * Created by student on 2015/03/13.
 */
public class MaintainedAeroplane implements FlightState{
    @Override
    public String Fly()
    {
        return "Taking off, safely";
    }
    public String Land()
    {
        return "Landing, safely";
    }
}
