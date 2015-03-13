package za.ac.cput.testCases;

/**
 * Created by student on 2015/03/13.
 */
public class GradeBHandler extends GradeHandler {
    @Override
    public String handleRequest(int request) {
        if(request > 70 & request < 75){
            return "B";
        }else{
            return successor.handleRequest(request);
        }
    }
}
