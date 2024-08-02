
import java.util.Scanner;

public class CalMarks {
    public static void main(String[] args) {
        System.out.println("Calculate The Total Markss and Percentage");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Marks in Hindi");
        int hindi = sc.nextInt();
        System.out.println("Enter The Marks in English");
        int english = sc.nextInt();
        System.out.println("Enter The Marks in Science");
        int science = sc.nextInt();
        System.out.println("Enter The Marks in Math");
        int math = sc.nextInt();
        System.out.println("Enter The Marks in Computer");
        int computer = sc.nextInt();
        int total_Marks = hindi + english + science + math + computer;
        System.out.println("Total marks " + total_Marks);
        int percentage = total_Marks / 5;
        System.out.println("Percentage " + percentage + "%");
    }

}
