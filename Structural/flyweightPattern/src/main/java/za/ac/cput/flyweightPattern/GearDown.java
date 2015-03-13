package za.ac.cput.flyweightPattern;

/**
 * Created by student on 2015/03/10.
 */
public class GearDown implements Speed {

    private static GearDown gDown=null;
    private int gear;

    private GearDown(){
        gear=0;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static GearDown getGearDownInst(){
        if(gDown==null)
            return new GearDown();
        else
            return gDown;
    }
    @Override
    public int getGear() {
        if(gear<=0)
          return 0;
        else
            return --gear;
    }
}
