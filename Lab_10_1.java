import java.io.*;
public class Lab_10_1 {
    public static void main(String[] args) {
        try{

          
            
                
            BufferedReader br = new BufferedReader(new FileReader("Lab_10_1_text.txt"));
            String data = "";
            int countCharecter = 0;
            int countSentence = 0;
            int countWord = 0;

                while((data = br.readLine()) != null){
                    String[] s = data.split("\\s+");
                    countWord+=s.length;
                   // System.out.println(s);
                    
                    countSentence++;
                    countCharecter+=data.length();
                }
                System.out.println("Number of Characters = "+countCharecter);
                System.out.println("Number of sentence = "+countSentence);
                System.out.println("Number of Words = "+countWord);
                br.close();
               
        }
        catch(Exception e){
           System.out.println("File is not Readble chhe.....");
        }
        


    }
}
