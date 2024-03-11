import java.util.Scanner;

public class ProfitLoss 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cp :");
        double cp = sc.nextDouble();
        System.out.print("Enter sp :");
        double sp = sc.nextDouble();
        
        if(cp==sp) System.out.println("No profit no loss");

        if(sp>cp)
        {
            System.out.println("Profit");
            System.out.println("The profit is :" +(sp-cp));
        }
        if(cp>sp)
        {
            System.out.println("Loss");
            System.out.println("The loss is : " +(cp-sp));
        }
        sc.close();

    }
}
