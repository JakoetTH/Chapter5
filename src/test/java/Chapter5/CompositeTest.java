package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Composite.Hangar;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class CompositeTest {
    private ApplicationContext ctx;
    private Hangar hangar;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        hangar = (Hangar)ctx.getBean("CompositeBean");
    }
    @Test
    public void testComposite()
    {
        Assert.assertEquals("I am flying",hangar.fly());
    }
    @After
    public void tearDown()
    {

    }
}
