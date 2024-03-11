
import java.util.Scanner;

public class Greates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st no :");
        int a=sc.nextInt();
        System.out.print("Enter 2nd no :");
        int b=sc.nextInt();
        System.out.print("Enter 3rd no :");
        int c=sc.nextInt();

        // if(a>b && a>c) System.out.println(+a+" is greatest");
        // if(b>c && b>a) System.out.println(+b+" is greatest");
        // if(c>b && c>a) System.out.println(+c+" is greatest");

        if(a>=b && a>=c) System.out.println(+a+" is greatest");     // This when 2 or 3 number are equal
        else if(b>=c && b>=a) System.out.println(+b+" is greatest");
        else System.out.println(+c+" is greatest");
        sc.close();
    }
}



