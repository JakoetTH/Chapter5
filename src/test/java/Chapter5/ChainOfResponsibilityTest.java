package Chapter5;

import Chapter5.Impl.ChainOfResponsibility.GradeAHandler;
import Chapter5.Config.SpringConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class ChainOfResponsibilityTest {
    private ApplicationContext ctx;
    private GradeAHandler gradehandler;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        gradehandler = (GradeAHandler)ctx.getBean("GradeHandlerBean");
    }
    @Test
    public void testGradeHandler()
    {
        Assert.assertEquals("C",gradehandler.handleRequest(66));
    }
    @After
    public void tearDown()
    {

    }
}
