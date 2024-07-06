import java.util.Scanner;

class Student {
    int idno;
    int noOfSub = 6;
    String subName[] = { "C", "Math", "DF", "PHY", "ES", "IC" };
    int subCredit[] = { 6, 6, 5, 5, 2, 2 };
    String grade[];
    double spi;

    Student() {

    }

    public void calcSpi() {
        int totalGradePoints = 0;

        for (int i = 0; i < noOfSub; i++) {
            switch (grade[i]) {
                case "A+" :
                totalGradePoints = 10*subCredit[i];
                break;
            }

        }
    }

}

public class StudentDetails {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of students:");
            int n = sc.nextInt();

            Student s[] = new Student[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter id no:");
                int idNo = sc.nextInt();
                String grade[] = new String[6];
                for (int j = 0; j < 6; j++) {
                    System.out.println("Enter grades of Sub" + j + 1);
                    grade[j] = sc.next();
                }
            }
        }
}
