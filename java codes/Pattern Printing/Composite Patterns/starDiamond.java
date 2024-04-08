import java.util.Scanner;
public class starDiamond {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n");
    int n=sc.nextInt();
    
    int nsp=n-1;
    int nst=1;

    // Above Triangle
    for(int i=1;i<=n;i++)
    { 
        for(int j=1;j<=nsp;j++){        //spaces
            System.out.print(" " + " ");
        }
        for(int j=1;j<=nst;j++){         //stars
            System.out.print("*" + " ");
        }
        System.out.println();
        nst+=2;
        nsp--;
   }

    //Below Triangle
    nsp = 1;
    nst = nst-4;
    for(int i=1;i<=n;i++)
    { 
        for(int j=1;j<=nsp;j++){        //spaces
            System.out.print(" " + " ");
        }
        for(int j=1;j<=nst;j++){         //stars
            System.out.print("*" + " ");
        }
        System.out.println();
        nst-=2;
        nsp++;
   }
    sc.close();
}
}
