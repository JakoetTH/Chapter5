package Chapter5;
import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Prototype.PrototypeAeroplane;
import Chapter5.Impl.Prototype.CloneObject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class PrototypeTest {
    private ApplicationContext ctx;
    private PrototypeAeroplane aeroplane;
    private CloneObject clone;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        aeroplane = (PrototypeAeroplane)ctx.getBean("PrototypeBean");
        clone = aeroplane.makeCopy();
    }
    @Test
    public void testPrototype()
    {
        Assert.assertEquals("This is an Aeroplane",clone.getName());
    }
    @After
    public void tearDown()
    {

    }
}
