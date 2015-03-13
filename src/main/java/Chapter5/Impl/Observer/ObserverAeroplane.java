package Chapter5.Impl.Observer;

/**
 * Created by student on 2015/03/13.
 */
public class ObserverAeroplane implements Aircraft {
    @Override
    public String addPassenger()
    {
        return "Passenger has boarded the aeroplane";
    }
    public String removePassenger()
    {
        return "Passenger has left the aeroplane";
    }
    public String notifyPassenger()
    {
        return "Passenger has been notified of their status";
    }
}
