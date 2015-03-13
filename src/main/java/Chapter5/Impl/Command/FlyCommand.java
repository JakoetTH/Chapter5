package Chapter5.Impl.Command;

/**
 * Created by student on 2015/03/13.
 */
public class FlyCommand implements Command {
    Fly flying;
    public FlyCommand(Fly flying)
    {
        this.flying = flying;
    }
    @Override
    public String execute()
    {
        return flying.fly();
    }
}
