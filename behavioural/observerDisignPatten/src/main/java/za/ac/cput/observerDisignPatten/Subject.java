package za.ac.cput.observerDisignPatten;

/**
 * Created by student on 2015/03/13.
 */
public interface Subject {
    public void addObserver(Observer obs);
    public void removeObserver(Observer obs);
    public String notifyObserver();

}
