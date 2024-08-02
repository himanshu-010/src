import java.util.Scanner;

public class sum_of_2_num {
    public static void main(String[] args) {
        System.out.println("Taking Input in two Number");
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter First Number1");
        int a = hi.nextInt();
        System.out.println("Enter Second Number2");
        int b = hi.nextInt();
        int sum = a + b;
        System.out.println("Sum of two Number is ");
        System.out.println(sum);
    }

}
