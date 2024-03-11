import java.util.Scanner;

public class andOperator {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n :");
    int n=sc.nextInt();
    if(n>99 && n<1000) System.out.println("3 digit");
    else System.out.println("not 3 digit");
    if(n>9999 && n<100000) System.out.println("5 digit");
    else System.out.println("NOt 5 digit");
    sc.close();
   } 
}
