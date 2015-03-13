package Chapter5.Impl.Factories;

/**
 * Created by student on 2015/03/13.
 */
public class TempEmployeeFactory implements Factory {
    private static TempEmployeeFactory tempEmployeeFactory = null;

    private TempEmployeeFactory() {
    }

    public static TempEmployeeFactory getTempEmployeeFactoryInstance()
    {
        if(tempEmployeeFactory == null)
            tempEmployeeFactory = new TempEmployeeFactory();
        return tempEmployeeFactory;
    }
    @Override
    public Employee getEmployeeRole(String employee)
    {
        if("Freelancer".equalsIgnoreCase(employee))
        {
            return new Freelancer();
        }
        return new Outsourced();
    }

}
