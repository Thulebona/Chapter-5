package za.ac.cput.testCases;

/**
 * Created by student on 2015/03/13.
 */
public class GradeDHandler extends GradeHandler {
    @Override
    public String handleRequest(int request) {
        if(request > 60 & request < 65){
            return "D";
        }else{
            return successor.handleRequest(request);
        }
    }
}