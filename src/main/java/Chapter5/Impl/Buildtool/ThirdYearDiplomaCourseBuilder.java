package Chapter5.Impl.Buildtool;

/**
 * Created by student on 2015/03/13.
 */
public class ThirdYearDiplomaCourseBuilder implements DiplomaCourseBuilder {
    private DiplomaCourse diplomaCourse;
    public ThirdYearDiplomaCourseBuilder() {
        diplomaCourse = new DiplomaCourse();
    }
    @Override
    public void buildTechnicalPrograming()
    {
        diplomaCourse.setTechnicalPrograming("TechnicalPrograming 2");
    }
    @Override
    public void buildInformationSystems()
    {
        diplomaCourse.setInformationSystems("Information Systems 3");
    }
    @Override
    public DiplomaCourse getDiplomaCourse()
    {
        return diplomaCourse;
    }
}
