package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Mediator.Mediator;
import Chapter5.Impl.Mediator.Passenger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MediatorTest {
    private ApplicationContext ctx;
    private Mediator mediator;
    private Passenger passenger;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        mediator = (Mediator)ctx.getBean("MediatorBean");
        passenger = mediator.getAfrikaansPassenger();
    }
    @Test
    public void testMediator()
    {
        Assert.assertEquals("Goeie More",passenger.sayHello());
    }
    @After
    public void tearDown()
    {

    }
}