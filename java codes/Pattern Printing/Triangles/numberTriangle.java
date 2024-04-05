import java.util.Scanner;

public class numberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++) //rows
        {
            for(int j=1;j<=i;j++) //cols
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        for(int i=1;i<=m;i++) //rows
        {
            for(int j=1;j<=i;j++) //cols
            {
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    sc.close();
    }
}
