import java.util.Scanner;

public class alphabetSquare {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) //rows
        {
            for(int j=1;j<=n;j++) //cols
            {
                System.out.print((char)(j+64) +" ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++) //rows
        {
            for(int j=1;j<=n;j++) //cols
            {
                System.out.print((char)(i+64) +" ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++) //rows
        {
            for(int j=1;j<=n;j++) //cols
            {
                System.out.print((char)(j+96) +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
