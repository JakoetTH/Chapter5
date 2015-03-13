package Chapter5.Impl.Strategy;

/**
 * Created by student on 2015/03/13.
 */
public interface TicketPrice {
    int price = 500;
    public int adjustPrice(int change);
}
