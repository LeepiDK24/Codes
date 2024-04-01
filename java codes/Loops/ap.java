import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of terms");
        int n=sc.nextInt();
        // System.out.println("Enter common difference");
        // int d=sc.nextInt();
        // System.out.println("Enter a");
        // int a=sc.nextInt();

        // for(int i=a;i<=a+d*(n-1);i+=d){
        //     System.out.println(i);
        // }

        // Method 2
        int a=5,d=-4;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a+=d;
        }

        sc.close();
    }
}
