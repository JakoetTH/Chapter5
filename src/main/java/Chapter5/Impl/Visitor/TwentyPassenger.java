package Chapter5.Impl.Visitor;

/**
 * Created by student on 2015/03/13.
 */
public class TwentyPassenger implements NumberPassenger {
    @Override
    public String incrementPassenger()
    {
        return "Increased passengers by twenty";
    }
}
