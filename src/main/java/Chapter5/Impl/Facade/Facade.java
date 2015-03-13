package Chapter5.Impl.Facade;

/**
 * Created by student on 2015/03/13.
 */
public class Facade {

    public int finalSpeed()
    {
        FlyFast fly = new FlyFast();
        IncreaseSpeed speed = new IncreaseSpeed();
        return speed.Faster(fly.Speed());
    }
}
