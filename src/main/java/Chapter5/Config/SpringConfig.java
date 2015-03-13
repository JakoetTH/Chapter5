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
import Chapter5.Impl.Flyweight.FlyweightFactory;
import Chapter5.Impl.Facade.Facade;
import Chapter5.Impl.Bridge.Aeroplane;
import Chapter5.Impl.Bridge.HighCapacity;
import Chapter5.Impl.Decorator.ColourAeroplane;
import Chapter5.Impl.Template.TemplateAeroplane;
import Chapter5.Impl.Mediator.Mediator;
import Chapter5.Impl.Observer.ObserverAeroplane;
import Chapter5.Impl.Strategy.HikePrice;
import Chapter5.Impl.Command.FlyCommand;
import Chapter5.Impl.Command.Fly;
import Chapter5.Impl.State.DamagedAeroplane;
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
    @Bean(name="FlyweightBean")
    public FlyweightFactory getFlyweight()
    {
        return FlyweightFactory.getInstance();
    }
    @Bean(name="FacadeBean")
    public Facade getFacade()
    {
        return new Facade();
    }
    @Bean(name="BridgeBean")
    public Aeroplane getBridge()
    {
        return new Aeroplane(new HighCapacity());
    }
    @Bean(name="DecorateBean")
    public ColourAeroplane getDecorated()
    {
        return new ColourAeroplane();
    }
    @Bean(name="TemplateBean")
    public TemplateAeroplane getTemplate()
    {
        return new TemplateAeroplane();
    }
    @Bean(name="MediatorBean")
    public Mediator getMediator()
    {
        return new Mediator();
    }
    @Bean(name="ObserverBean")
    public ObserverAeroplane getObserver()
    {
        return new ObserverAeroplane();
    }
    @Bean(name="StrategyBean")
    public HikePrice getPrice()
    {
        return new HikePrice();
    }
    @Bean(name="CommandBean")
    public FlyCommand getFlyCommand()
    {
        return new FlyCommand(new Fly());
    }
    @Bean(name="StateBean")
    public DamagedAeroplane getState()
    {
        return new DamagedAeroplane();
    }
}