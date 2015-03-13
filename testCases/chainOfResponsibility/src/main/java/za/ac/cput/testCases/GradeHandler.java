package za.ac.cput.testCases;

/**
 * Hello world!
 *
 */
public abstract class GradeHandler {
    GradeHandler successor;
    public void setSuccessor(GradeHandler successor) {
        this.successor = successor;
    }
    public abstract String handleRequest(int request);
}
