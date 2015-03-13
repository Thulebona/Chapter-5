package za.ac.cput.proxyPattern;

/**
 * Created by student on 2015/03/10.
 */
public class RealFile implements File {

    private String fileName;
    private static RealFile rFile=null;

    private RealFile(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    public static RealFile getRealFileInst(String fileName ) {
        if (rFile == null)
           return rFile = new RealFile(fileName);
        else
            return rFile;
    }

    @Override
    public String getFile() {
       return fileName;
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
