package Chapter5;

import Chapter5.Config.SpringConfig;
import Chapter5.Impl.SecondYearDiplomaCourseBuilder;
import Chapter5.Impl.DiplomaCourse;
import Chapter5.Impl.DiplomaCourseBuilder;
import Chapter5.Impl.DiplomaCourseDirector;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class BuilderTest {
    private ApplicationContext ctx;
    private SecondYearDiplomaCourseBuilder builder;
    private DiplomaCourse diploma;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        builder = (SecondYearDiplomaCourseBuilder)ctx.getBean("SecondYearDiplomaBean");
        builder.buildInformationSystems();
        diploma = builder.getDiplomaCourse();

    }
    @Test
    public void testBuilder()
    {
        Assert.assertEquals("Information Systems 2",diploma.getInformationSystems());
    }
    @After
    public void tearDown()
    {

    }
}

