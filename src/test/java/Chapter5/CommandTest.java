package Chapter5;
import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Command.FlyCommand;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class CommandTest {
    private ApplicationContext ctx;
    private FlyCommand flight;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        flight = (FlyCommand)ctx.getBean("CommandBean");
    }
    @Test
    public void testCommand()
    {
        Assert.assertEquals("Taking off",flight.execute());
    }
    @After
    public void tearDown()
    {

    }
}
