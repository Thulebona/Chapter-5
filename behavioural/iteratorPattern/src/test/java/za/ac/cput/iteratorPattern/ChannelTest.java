package za.ac.cput.iteratorPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by student on 2015/03/13.
 */
public class ChannelTest {

    Channel channel1,channel2,channel3,channel4;
    Remote rmt;
    @Before
    public void setUp() throws Exception {
        channel1 = new Channel("Etv",3);
        channel2 = new Channel("SABC 1",1);
        channel3 = new Channel("SABC 2",2);
        channel4 = new Channel("Etv",4);

        rmt = new Remote();

    }

    @Test
    public void testChannels() throws Exception {
        Channel chn=null,chn2=null;
        rmt.addChannel(channel1);
        rmt.addChannel(channel2);
        rmt.addChannel(channel3);
        rmt.addChannel(channel4);


        Iterator<Channel> nextChn = rmt.iterator();

        if(nextChn.hasNext()){
             chn  = nextChn.next();
                    nextChn.next();
                    nextChn.next();
             chn2 = nextChn.next();
        }

        Assert.assertSame( chn.getChnnlName(), chn2.getChnnlName());
    }
}
