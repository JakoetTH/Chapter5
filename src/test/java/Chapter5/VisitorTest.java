package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Visitor.VisitorAeroplane;
import Chapter5.Impl.Visitor.TwentyPassenger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class VisitorTest {
    private ApplicationContext ctx;
    private TwentyPassenger passenger;
    private VisitorAeroplane flight;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        flight = (VisitorAeroplane)ctx.getBean("VisitorBean");
    }
    @Test
    public void testVisitor()
    {
        Assert.assertEquals("Adding twenty Passengers",flight.addPassenger(passenger));
    }
    @After
    public void tearDown()
    {

    }
}
