import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length :");
        int l = sc.nextInt();
        System.out.println("Enter breadth :");
        int b = sc.nextInt();

        if((l*b) > 2*(l+b)) {
           System.out.println("Area is greater"); 
        }
        else{
            System.out.println("Perimeter is greater");
        }
        sc.close();
    }
}
