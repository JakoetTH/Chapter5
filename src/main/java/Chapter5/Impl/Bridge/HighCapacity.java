package Chapter5.Impl.Bridge;

/**
 * Created by student on 2015/03/13.
 */
public class HighCapacity implements Capacity{
    @Override
    public int Load()
    {
        return 500;
    }
}
