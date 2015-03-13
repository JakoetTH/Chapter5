package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Proxy.EarlyFlight;
import java.util.Date;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class ProxyTest {
    private ApplicationContext ctx;
    private EarlyFlight flight;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        flight = (EarlyFlight)ctx.getBean("ProxyBean");
    }
    @Test
    public void testProxy()
    {
        Assert.assertEquals(new Date(),flight.FlightTime());
    }
    @After
    public void tearDown()
    {

    }
}
