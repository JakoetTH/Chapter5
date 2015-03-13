package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Bridge.Aeroplane;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class BridgeTest {
    private ApplicationContext ctx;
    private Aeroplane flight;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        flight = (Aeroplane)ctx.getBean("BridgeBean");
    }
    @Test
    public void testBridge()
    {
        Assert.assertEquals("This Aeroplane is flying with 500 passengers",flight.fly());
    }
    @After
    public void tearDown()
    {

    }
}
