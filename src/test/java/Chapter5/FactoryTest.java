package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.EmployeeFactory;
import Chapter5.Impl.Employee;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class FactoryTest {
    private ApplicationContext ctx;
    private EmployeeFactory factory;
    private Employee lecturer;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        factory = (EmployeeFactory)ctx.getBean("FactoryBean");
        lecturer = factory.getEmployeeRole("Lecturer");
    }
    @Test
    public void testFactory()
    {
        Assert.assertEquals("I am a Lecturer",lecturer.role());
    }
    @After
    public void tearDown()
    {

    }
}