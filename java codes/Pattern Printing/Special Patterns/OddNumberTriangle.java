import java.util.Scanner;
public class OddNumberTriangle 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter side");
    int m=sc.nextInt();

    // Method 1
    for(int i=1;i<=m;i++) //rows
    {
        for(int j=1;j<=i;j++) //cols
        {
            System.out.print(2*j-1+ " "); //2n-1 represents odd number
        }
        System.out.println();
    
    }  

    // Method 2
    for(int i=1;i<=m;i++) //rows
    {
        int a=1;
        for(int j=1;j<=i;j++) //cols
        {
            System.out.print(a+ " "); 
            a+=2;
        }
        System.out.println();
    
    }  

    sc.close();
 }
}
