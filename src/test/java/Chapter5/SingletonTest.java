package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Singleton;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SingletonTest {
    private ApplicationContext ctx;
    private Singleton singleton;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        singleton = (Singleton)ctx.getBean("SingletonBean");
    }
    @Test
    public void testSingleton()
    {
        Assert.assertEquals("Hello",singleton.sayHello());
    }
    @After
    public void tearDown()
    {

    }
}
