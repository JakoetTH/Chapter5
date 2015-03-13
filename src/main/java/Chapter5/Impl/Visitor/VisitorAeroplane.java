package Chapter5.Impl.Visitor;

/**
 * Created by student on 2015/03/13.
 */
public class VisitorAeroplane implements Passenger{
    @Override
    public String addPassenger(TwoPassenger passenger)
    {
        return "Adding two Passengers";
    }
    @Override
    public String addPassenger(TwentyPassenger passenger)
    {
        return "Adding twenty Passengers";
    }
}
