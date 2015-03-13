package Chapter5.Impl.Factories;


public class AbstractFactory {
    private static AbstractFactory abstractfactory = null;
    private AbstractFactory()
    {

    }
    public static AbstractFactory getAbstractFactoryInstance()
    {
        if(abstractfactory==null)
        {
            abstractfactory = new AbstractFactory();
        }
        return abstractfactory;
    }
    public Factory getEmployeeType(String type)
    {
        if("Employee".equalsIgnoreCase(type)) {
            return EmployeeFactory.getEmployeeFactoryInstance();
        }
        return TempEmployeeFactory.getTempEmployeeFactoryInstance();
    }
}
