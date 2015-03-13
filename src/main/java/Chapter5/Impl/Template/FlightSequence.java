package Chapter5.Impl.Template;

/**
 * Created by student on 2015/03/13.
 */
public abstract class FlightSequence {
    public final void Sequence() {
        startEngine();
        Accelorate();
        takeOff();
    }
    public abstract String startEngine();
    public abstract String Accelorate();
    public abstract String takeOff();
}
