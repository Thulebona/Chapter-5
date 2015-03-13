package za.ac.cput.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/03/10.
 */
public class GearShifting {
    private static GearShifting gearS = null;
    private Map<String,Speed>  gear;

    public static GearShifting getInstance() {
        if(gearS==null)
            return  new GearShifting();
        else
        return gearS;
    }

    private GearShifting() {
        gear = new HashMap<String,Speed>();
    }

    public Speed getGears(String key){
        if(gear.containsKey(key))
            return gear.get(key);
        else
        {
            Speed sp;
            if("up".equalsIgnoreCase(key)){
                sp = GearUp.getGearUpInst();
            }else
                sp = GearDown.getGearDownInst();

            gear.put("Down",sp);
            return sp;
        }

    }
}
