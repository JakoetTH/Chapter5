package Chapter5.Impl.Bridge;

/**
 * Created by student on 2015/03/13.
 */
public class Aeroplane extends Aircraft{

    public Aeroplane(Capacity capacity)
    {
        this.capacity = capacity;
        this.passengers = this.capacity.Load();
    }
    @Override
    public String fly()
    {
        return "This Aeroplane is flying with " + String.valueOf(this.passengers) + " passengers";
    }
}
