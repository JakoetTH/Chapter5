package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.State.DamagedAeroplane;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class StateTest {
    private ApplicationContext ctx;
    private DamagedAeroplane flight;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        flight = (DamagedAeroplane)ctx.getBean("StateBean");
    }
    @Test
    public void testState()
    {
        Assert.assertEquals("Emergency landing gear failed to deploy...",flight.Land());
    }
    @After
    public void tearDown()
    {

    }
}
