package Chapter5.Impl.Proxy;
import java.util.Date;
public class EarlyFlight extends FlightSchedule{
    @Override
    public Date FlightTime()
    {
        return new Date();
    }
}
