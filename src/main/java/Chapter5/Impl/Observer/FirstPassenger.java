package Chapter5.Impl.Observer;

/**
 * Created by student on 2015/03/13.
 */
public class FirstPassenger implements Passenger{
    @Override
    public String updatePassenger()
    {
        return "First Passenger has booked a ticket";
    }
}
