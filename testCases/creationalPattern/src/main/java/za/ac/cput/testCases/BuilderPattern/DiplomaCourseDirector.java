package za.ac.cput.testCases.BuilderPattern;

/**
 * Created by student on 2015/03/13.
 */
public class DiplomaCourseDirector {
    private DiplomaCourseBuilder diplomaCourseBuilder = null;

    public DiplomaCourseDirector(DiplomaCourseBuilder diplomaCourseBuilder) {
        this.diplomaCourseBuilder = diplomaCourseBuilder;
    }

    public void constructDiplomaCourse() {
        diplomaCourseBuilder.buildDevelopmentSoftware();
        diplomaCourseBuilder.buildInformationSystems();
        diplomaCourseBuilder.buildTechnicalPrograming();
        diplomaCourseBuilder.buildInternetPrograming();
    }

    public DiplomaCourse getDiplomaCourse() {
        return diplomaCourseBuilder.getDiplomaCourse();
    }
}