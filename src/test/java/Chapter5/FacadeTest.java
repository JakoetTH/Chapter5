package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Facade.Facade;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class FacadeTest {
    private ApplicationContext ctx;
    private Facade flight;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        flight = (Facade)ctx.getBean("FacadeBean");
    }
    @Test
    public void testProxy()
    {
        Assert.assertEquals(100,flight.finalSpeed());
    }
    @After
    public void tearDown()
    {

    }
}
