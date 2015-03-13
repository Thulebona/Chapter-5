package za.ac.cput.proxyPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class ProxyPatternTest {

    File file;

    @Before
    public void setUp() throws Exception {
        file = FileProxy.getFileProxy("book.pdf");
    }

    @Test
    public void testFilename() throws Exception {

        Assert.assertSame(file.getFile(),"book.pdf");
    }
}

