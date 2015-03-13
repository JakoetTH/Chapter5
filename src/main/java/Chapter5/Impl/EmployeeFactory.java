package Chapter5.Impl;

/**
 * Created by student on 2015/03/13.
 */
public class EmployeeFactory {
    private static EmployeeFactory employeeFactory = null;

    private EmployeeFactory() {
    }

    public static EmployeeFactory getEmployeeFactoryInstance()
    {
        if(employeeFactory == null)
            return new EmployeeFactory();
        return employeeFactory;
    }

    public Employee getEmployeeRole(String employee)
    {
        if("Lecturer".equalsIgnoreCase(employee))
        {
            return new Lecturer();
        }
        return new Secretary();
    }
}
