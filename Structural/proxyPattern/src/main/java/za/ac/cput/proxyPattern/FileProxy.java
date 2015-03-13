package za.ac.cput.proxyPattern;

/**
 * Created by student on 2015/03/10.
 */
public class FileProxy implements File{

    private RealFile realFile;
    private String fileName;
    private static FileProxy fileP=null;

    private FileProxy(String fileName){

        this.fileName = fileName;
        realFile =RealFile.getRealFileInst(fileName);
    }
    public static FileProxy getFileProxy(String fileName){
        if(fileP==null)
            return new FileProxy(fileName);
        else
            return fileP;
    }

    @Override
    public String getFile() {
       return realFile.getFile();
    }
}
