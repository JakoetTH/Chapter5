package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Strategy.HikePrice;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class StrategyTest {
    private ApplicationContext ctx;
    private HikePrice price;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        price = (HikePrice)ctx.getBean("StrategyBean");
    }
    @Test
    public void testBridge()
    {
        Assert.assertEquals(700,price.adjustPrice(200));
    }
    @After
    public void tearDown()
    {

    }
}
