package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.EmployeeFactory;
import Chapter5.Impl.TempEmployeeFactory;
import Chapter5.Impl.Factory;
import Chapter5.Impl.AbstractFactory;
import Chapter5.Impl.Employee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class AbstractFactoryTest {
    private ApplicationContext ctx;
    private AbstractFactory abstractfactory;
    private Factory factory;
    private Employee freelancer;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        abstractfactory = (AbstractFactory)ctx.getBean("AbstractFactoryBean");
        factory = abstractfactory.getEmployeeType("TempEmployee");
        freelancer = factory.getEmployeeRole("Freelancer");
    }
    @Test
    public void testAbstractFactory()
    {
        Assert.assertEquals("I am a Freelancer",freelancer.role());
    }
    @After
    public void tearDown()
    {

    }
}