package Chapter5.Impl.Proxy;

import java.util.Date;
public class LateFlight extends FlightSchedule{
    @Override
    public Date FlightTime()
    {
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {

        }
        return new Date();
    }
}
