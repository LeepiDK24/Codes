import java.util.Scanner;

public class ntable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for(int i=n;i<=n*10;i+=n){
            System.out.println(i);
        }
        sc.close();
    
        
    }
}
