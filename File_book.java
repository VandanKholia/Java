import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_book {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("File_book.txt");
            String s = "The secret\nThe end";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            FileInputStream fin = new FileInputStream("File_book.txt");
            
            int i=0;
            while((i = fin.read())!= -1) {
                    System.out.print((char)i);
            }
            fin.close();
            
        
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
