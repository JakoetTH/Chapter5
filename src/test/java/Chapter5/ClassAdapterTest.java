package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.SocketClassAdapter;
import Chapter5.Impl.Voltage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class ClassAdapterTest {
    private ApplicationContext ctx;
    private SocketClassAdapter socketclass;
    private Voltage volt;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        socketclass = (SocketClassAdapter)ctx.getBean("ClassAdapterBean");
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
