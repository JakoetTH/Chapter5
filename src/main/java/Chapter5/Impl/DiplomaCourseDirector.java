package Chapter5.Impl;

/**
 * Created by student on 2015/03/13.
 */
public class DiplomaCourseDirector {
    private DiplomaCourseBuilder diplomaCourseBuilder = null;
    public DiplomaCourseDirector(DiplomaCourseBuilder diplomaCourseBuilder){
        this.diplomaCourseBuilder = diplomaCourseBuilder;
    }

    public void constructDiplomaCourse(){
        diplomaCourseBuilder.buildInformationSystems();
        diplomaCourseBuilder.buildTechnicalPrograming();
    }

    public DiplomaCourse getDiplomaCourse(){
        return diplomaCourseBuilder.getDiplomaCourse();
    }
}
