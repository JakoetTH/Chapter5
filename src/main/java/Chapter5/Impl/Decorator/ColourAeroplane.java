package Chapter5.Impl.Decorator;

/**
 * Created by student on 2015/03/13.
 */
public class ColourAeroplane extends DecorateAeroplane {
    @Override
    public String Shape()
    {
        return "Concave with wings";
    }
    public String Colour()
    {
        return "Purple";
    }

}
