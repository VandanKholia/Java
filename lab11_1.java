import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.marks = marks;
        this.name = name;
    }
    public String print() {
        return "name"+name+","+"marks"+marks;
    }
}

public class lab11_1 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("lab11_1.txt"));
            bw.write("Vandan,300\n");
    

            bw.write("Meet,280\n");
           
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("lab11_1.txt"));
            String temp = "";
            while((temp = br.readLine())!=null) {
                    String[] s = temp.split(",");
                    String tempName = s[0];
                    int tempmark = Integer.parseInt(s[1]);
                    Student st = new Student(tempName, tempmark);
                    System.out.println(st.print());
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
