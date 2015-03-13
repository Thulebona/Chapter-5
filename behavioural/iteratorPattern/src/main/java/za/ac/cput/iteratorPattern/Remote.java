package za.ac.cput.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class Remote {
    private List <Channel> changeChn;

    public Remote(){
        changeChn = new ArrayList<Channel>();
    }

    public void addChannel(Channel channel){
        changeChn.add(channel);
    }
    public Iterator<Channel> iterator(){
        return new nextChannel();
    }

    class nextChannel implements Iterator<Channel> {

        int currentChannel = 0 ;
        @Override
        public boolean hasNext() {
            if(currentChannel>=changeChn.size())
                return false;
            else
                return true;
        }

        @Override
        public Channel next() {
            return changeChn.get(currentChannel++);
        }

        @Override
        public void remove() {
            changeChn.remove(--currentChannel);
        }

    }
}
