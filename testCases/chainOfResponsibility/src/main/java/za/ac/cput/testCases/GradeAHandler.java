package za.ac.cput.testCases;

/**
 * Created by student on 2015/03/13.
 */
public class GradeAHandler extends GradeHandler{
    @Override
    public String handleRequest(int request) {
        if(request > 75){
            return "A";
        }else{
            return successor.handleRequest(request);
        }
    }
}