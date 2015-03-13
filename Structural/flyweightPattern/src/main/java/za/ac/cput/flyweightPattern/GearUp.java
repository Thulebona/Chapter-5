package za.ac.cput.flyweightPattern;

/**
 * Created by student on 2015/03/10.
 */
public class GearUp implements Speed {

    private static GearUp gUp=null;
    private int gear;

    private GearUp(){
        gear=0;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static GearUp getGearUpInst(){
        if(gUp==null)
            return new GearUp();
        else
            return gUp;
    }
    @Override
    public int getGear() {
        return ++gear;
    }
}
