import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;



public class CopyFile {

    public static void main(String[] args) throws Exception {
        File a = new File("src/source.txt");
        File b = new File("src/target.txt");
        copyContent(a,b);
    }

    public static void copyContent(File CopyFile, File TargetFile) throws Exception {
        FileInputStream in = new FileInputStream(CopyFile);
        FileOutputStream out = new FileOutputStream(TargetFile);

        try {
            int n;
            while ((n = in.read()) != -1) {
                out.write(n);
            }
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");
    }
}

