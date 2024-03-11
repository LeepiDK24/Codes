import java.util.Scanner;

public class sumInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number :");
        double a=sc.nextDouble();
        System.out.print("Enter 2nd number :");
        double b=sc.nextDouble();
        System.out.println("Addition is :" + (a+b));
        sc.close();

    }
}
