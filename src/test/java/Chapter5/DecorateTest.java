package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Decorator.ColourAeroplane;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class DecorateTest {
    private ApplicationContext ctx;
    private ColourAeroplane flight;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        flight = (ColourAeroplane)ctx.getBean("DecorateBean");
    }
    @Test
    public void testDecorate()
    {
        Assert.assertEquals("Purple",flight.Colour());
    }
    @After
    public void tearDown()
    {

    }
}