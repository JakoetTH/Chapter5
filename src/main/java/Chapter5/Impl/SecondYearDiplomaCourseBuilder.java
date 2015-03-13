package Chapter5.Impl;

/**
 * Created by student on 2015/03/13.
 */
public class SecondYearDiplomaCourseBuilder implements DiplomaCourseBuilder {
    private DiplomaCourse diplomaCourse;
    public SecondYearDiplomaCourseBuilder() {
        diplomaCourse = new DiplomaCourse();
    }
    @Override
    public void buildTechnicalPrograming()
    {
        diplomaCourse.setTechnicalPrograming("Technical Programing 1");
    }
    @Override
    public void buildInformationSystems()
    {
        diplomaCourse.setInformationSystems("Information Systems 2");
    }
    @Override
    public DiplomaCourse getDiplomaCourse()
    {
        return diplomaCourse;
    }
}
