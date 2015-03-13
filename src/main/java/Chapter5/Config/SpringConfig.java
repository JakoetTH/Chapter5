package Chapter5.Config;

import Chapter5.Impl.Prototype.PrototypeAeroplane;
import Chapter5.Impl.Singleton.Singleton;
import Chapter5.Impl.Factories.EmployeeFactory;
import Chapter5.Impl.Factories.AbstractFactory;
import Chapter5.Impl.Buildtool.SecondYearDiplomaCourseBuilder;
import Chapter5.Impl.Adapter.SocketClassAdapter;
import Chapter5.Impl.Adapter.SocketObjectAdapter;
import Chapter5.Impl.ChainOfResponsibility.GradeAHandler;
import Chapter5.Impl.Composite.Hangar;
import Chapter5.Impl.Proxy.EarlyFlight;
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
    @Bean(name="PrototypeBean")
    public PrototypeAeroplane getAeroplane()
    {
        return new PrototypeAeroplane("This is an Aeroplane");
    }
    @Bean(name="ClassAdapterBean")
    public SocketClassAdapter getClassAdapter()
    {
        return new SocketClassAdapter();
    }
    @Bean(name="ObjectAdapterBean")
    public SocketObjectAdapter getObjectAdapter()
    {
        return new SocketObjectAdapter();
    }
    @Bean(name="GradeHandlerBean")
    public GradeAHandler getGradeHandler()
    {
        return new GradeAHandler();
    }
    @Bean(name="CompositeBean")
    public Hangar getHangar()
    {
        return new Hangar();
    }
    @Bean(name="ProxyBean")
    public EarlyFlight getFlight()
    {
        return new EarlyFlight();
    }
}