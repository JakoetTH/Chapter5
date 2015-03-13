package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Flyweight.FlyweightFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class FlyweightTest {
    private ApplicationContext ctx;
    private FlyweightFactory flight;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        flight = (FlyweightFactory)ctx.getBean("FlyweightBean");
    }
    @Test
    public void testFlyweight()
    {
        Assert.assertEquals("Taking off",flight.Command());
    }
    @After
    public void tearDown()
    {

    }
}
