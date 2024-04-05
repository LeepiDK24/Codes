import java.util.Scanner;
public class alphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++) //rows
        {
            for(int j=1;j<=i;j++) //cols
            {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
