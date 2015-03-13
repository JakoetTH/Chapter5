package Chapter5.Impl.Decorator;

/**
 * Created by student on 2015/03/13.
 */
public class DecorateAeroplane implements Aeroplane {
    @Override
    public String Shape()
    {
        return "Concave";
    }
}
