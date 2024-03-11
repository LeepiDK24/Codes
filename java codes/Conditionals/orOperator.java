import java.util.Scanner;

public class orOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n =sc.nextInt();
        if(n%5==0 || n%3==0) System.out.println("Divisible by 3 or 5");
        else System.out.println("not Divisible by 3 or 5");
        sc.close();
    }
}
