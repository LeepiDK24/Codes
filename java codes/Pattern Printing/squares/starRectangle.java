import java.util.Scanner;

public class starRectangle
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int m=sc.nextInt();
        System.out.println("Enter cols");
        int n=sc.nextInt();

        // if the rows and  ols are input same then the same rectangle bcomes a square
        
        for(int i=1;i<=m;i++) //rows
        {
            for(int j=1;j<=n;j++) //cols
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    sc.close();
}
}