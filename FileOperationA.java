import java.io.*;

public class FileOperationA {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("fileA.txt");
        OutputStream os = new FileOutputStream("fileB.txt");

        int i =0 ;
        System.out.println("The files are ready......");
        while ((i = is.read())!=-1){
            os.write(i);

        }
        System.out.println(" the contents are copied from fileA to fileB");
    }
}
