import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        int vowel = 0;
        int constant = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='u' ||
            s.charAt(i)=='i' || s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' ) {
                vowel++;
            }
            else {
                constant++;
            }
        }
        System.out.println("Vowels:"+vowel);
        System.out.println("Constant:"+constant);
    }
}
