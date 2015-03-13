package Chapter5;


import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Memento.MementoAeroplane;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MementoTest {
    private ApplicationContext ctx;
    private MementoAeroplane flight;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        flight = (MementoAeroplane)ctx.getBean("MementoBean");
    }
    @Test
    public void testMemento()
    {
        Assert.assertEquals("Boeing-474",flight.getModel());
    }
    @After
    public void tearDown()
    {

    }
}
