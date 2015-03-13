package za.ac.cput.mementoPattern;

/**
 * Created by student on 2015/03/13.
 */
public class StudentInfor {

     String stdnum;
     String regData;
     int years;

    public StudentInfor(String stdnum, String regData, int years) {
        this.stdnum = stdnum;
        this.regData = regData;
        this.years = years;
    }

    @Override
    public String toString() {
        return "Student Number: "+stdnum+"\nRegistration Date: "+regData+"\nDuration: "+years;
    }
    public void setRegDataAndYears(String regData,int years){
        this.regData = regData;
        this.years = years;
    }
    public String getRegData(){
        return regData;
    }
    public Memento save(){
        return new  Memento(stdnum, regData,years);
    }

    public void restore(Object objMemento){
        Memento memento =(Memento)objMemento;
        stdnum = memento.mementoStdnum;
        regData = memento.mementoRegData;
        years = memento.mementoYears;
    }
    private class Memento {
        String mementoStdnum;
        String  mementoRegData;
        int  mementoYears;

        public Memento(String mementoStdnum, String mementoRegData, int mementoYears) {
            this.mementoStdnum = mementoStdnum;
            this.mementoRegData = mementoRegData;
            this.mementoYears = mementoYears;
        }
    }
}
