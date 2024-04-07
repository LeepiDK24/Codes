import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        int temp=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        int m=sc.nextInt();

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(temp + " ");
                temp++;
            }
        System.out.println();
        }

        sc.close();
    }
}
