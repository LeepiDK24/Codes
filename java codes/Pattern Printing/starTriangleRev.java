import java.util.Scanner;

public class starTriangleRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) //rows
        {
            for(int j=1;j<=n+1-i;j++) //cols
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++) //rows
        {
            for(int j=1;j<=n+1-i;j++) //cols
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        for(int i=1;i<=n;i++) //rows
        {
            for(int j=1;j<=n+1-i;j++) //cols
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }


        for(int i=1;i<=n;i++) //rows
        {
            for(int j=1;j<=n+1-i;j++) //cols
            {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++) //rows
        {
            for(int j=1;j<=n+1-i;j++) //cols
            {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }


    sc.close();
    }
}
