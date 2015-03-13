package Chapter5.Impl.Template;

/**
 * Created by student on 2015/03/13.
 */
public class TemplateAeroplane extends FlightSequence {
    @Override
    public String startEngine()
    {
        return "Engine is starting";
    }
    @Override
    public String Accelorate()
    {
        return "Aeroplane is riding down the runway";
    }
    @Override
    public String takeOff()
    {
        return "Aeroplane has taken flight";
    }
}
