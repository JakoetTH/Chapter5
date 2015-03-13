package Chapter5.Impl.Bridge;

/**
 * Created by student on 2015/03/13.
 */
public abstract class Aircraft {
    Capacity capacity;
    int passengers;
    public abstract String fly();
    public void setCapacity(Capacity capacity)
    {
        this.capacity = capacity;
    }
    public void setPassengers()
    {
        this.passengers = capacity.Load();
    }
}
