package Chapter5.Impl.State;

/**
 * Created by student on 2015/03/13.
 */
public class DamagedAeroplane implements FlightState {
    @Override
    public String Fly()
    {
        return "Trying to take off but failed.";
    }
    @Override
    public String Land()
    {
        return "Emergency landing gear failed to deploy...";
    }
}
