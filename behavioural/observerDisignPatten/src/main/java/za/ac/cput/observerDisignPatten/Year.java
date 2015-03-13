package za.ac.cput.observerDisignPatten;

import java.util.ArrayList;

/**
 * Created by student on 2015/03/13.
 */
public class Year implements Subject {
    private  String stdNum;
    private  String name;
    private  String year;
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public Year() {
    }

    public Year(String stdNum, String name, String year) {
        this.stdNum = stdNum;
        this.name = name;
        this.year = year;
    }

    public String getStdNum() {
        return stdNum;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public String setYear(String year) {
        this.year = year;
       return notifyObserver();
    }

    @Override
    public void addObserver(Observer obs) {
            observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public String notifyObserver() {
       String msg="";
        for (Observer obs: observers){
            System.out.println("notify change in year");
            msg = obs.updateYear(this.year);
        }
        return msg;
    }
}
