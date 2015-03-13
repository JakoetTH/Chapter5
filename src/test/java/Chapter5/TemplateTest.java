package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.Template.TemplateAeroplane;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TemplateTest {
    private ApplicationContext ctx;
    private TemplateAeroplane flight;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        flight = (TemplateAeroplane)ctx.getBean("TemplateBean");
    }
    @Test
    public void testTemplate()
    {
        Assert.assertEquals("Aeroplane is riding down the runway",flight.Accelorate());
    }
    @After
    public void tearDown()
    {

    }
}