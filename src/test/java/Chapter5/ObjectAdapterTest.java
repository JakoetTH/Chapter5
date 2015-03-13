package Chapter5;


import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Adapter.SocketObjectAdapter;
import Chapter5.Impl.Adapter.Voltage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class ObjectAdapterTest {
    private ApplicationContext ctx;
    private SocketObjectAdapter socketclass;
    private Voltage volt;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        socketclass = (SocketObjectAdapter)ctx.getBean("ObjectAdapterBean");
        volt = socketclass.get240Volt();
    }
    @Test
    public void testPrototype()
    {
        Assert.assertEquals(240, volt.getVolts());
    }
    @After
    public void tearDown()
    {

    }
}

