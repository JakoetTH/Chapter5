package Chapter5.Impl.Strategy;

/**
 * Created by student on 2015/03/13.
 */
public class LowerPrice implements TicketPrice{
    @Override
    public int adjustPrice(int change)
    {
        return this.price - change;
    }
}
