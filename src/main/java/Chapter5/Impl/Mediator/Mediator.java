package Chapter5.Impl.Mediator;

/**
 * Created by student on 2015/03/13.
 */
public class Mediator {
    Passenger englishpassenger;
    Passenger afrikaanspassenger;
    public Mediator()
    {
        this.afrikaanspassenger = new AfrikaansPassenger();
    }
    public void boardEnglishPassenger(EnglishPassenger englishpassenger)
    {
        this.englishpassenger = englishpassenger;
    }
    public void boardAfrikaansPassenger(AfrikaansPassenger afrikaanspassenger)
    {
        this.afrikaanspassenger = afrikaanspassenger;
    }
    public Passenger getAfrikaansPassenger()
    {
        return afrikaanspassenger;
    }
}
