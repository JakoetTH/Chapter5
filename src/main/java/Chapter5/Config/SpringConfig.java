package Chapter5.Config;

import Chapter5.Impl.Singleton;
import Chapter5.Impl.EmployeeFactory;
import Chapter5.Impl.AbstractFactory;
import Chapter5.Impl.SecondYearDiplomaCourseBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfig {
    @Bean(name="SingletonBean")
    public Singleton getSingleton()
    {
        return Singleton.getInstance();
    }
    @Bean(name="FactoryBean")
    public EmployeeFactory getFactory()
    {
        return EmployeeFactory.getEmployeeFactoryInstance();
    }
    @Bean(name="AbstractFactoryBean")
    public AbstractFactory getAbstractFactory()
    {
        return AbstractFactory.getAbstractFactoryInstance();
    }
    @Bean(name="SecondYearDiplomaBean")
    public SecondYearDiplomaCourseBuilder getSecondYearCourse()
    {
        return new SecondYearDiplomaCourseBuilder();
    }
}