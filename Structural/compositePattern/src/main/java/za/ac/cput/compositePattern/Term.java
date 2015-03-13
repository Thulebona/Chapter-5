package za.ac.cput.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/10.
 *
 */
public class Term implements Test{

    private static Term trm = null;
    private List<Test> test = new ArrayList<Test>();

    public static Term getTermInst(){
        if(trm ==null)
            return new Term();
        else
         return trm;
    }

    public void add(Test t) {
        test.add(t);
    }

    public void remove(Test t) {
        test.remove(t);
    }
    public int getListsize() {
        return test.size();
    }

    @Override
    public void Results() {
        for (Test t : test) {
            t.Results();
        }
    }
}
