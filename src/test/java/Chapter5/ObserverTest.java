package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Observer.ObserverAeroplane;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class ObserverTest {
    private ApplicationContext ctx;
    private ObserverAeroplane flight;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        flight = (ObserverAeroplane)ctx.getBean("ObserverBean");
    }
    @Test
    public void testObserver()
    {
        Assert.assertEquals("Passenger has boarded the aeroplane",flight.addPassenger());
    }
    @After
    public void tearDown()
    {

    }
}
