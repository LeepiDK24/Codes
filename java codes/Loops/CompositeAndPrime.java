import java.util.Scanner;

public class CompositeAndPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();

        int state=0; // state 0 is prime
        for(int i=2;i<=n-1;i++){
            if(n%i==0) {
            System.out.println("Composite");
            state=1;
            break;
            }
            
        }
        if(n==1) System.out.println("Neither Prime nor composite");
        else if(state==0) System.out.println("Prime");
     sc.close();
     }
}
