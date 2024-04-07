import java.util.Scanner;
public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
         // In this code 1 is being printed when i and j both are either even or both are odd 
                // so we can say that i+j will always be even bcuz even+even = odd+odd = even

    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             if(i%2==1){
    //                 if(j%2==1) System.out.print(1 +" ");
    //                 else System.out.print(0 + " ");
    //             }
    //             else{
    //             if(j%2==0) System.out.print(1 +" ");
    //             else System.out.print(0 + " ");
    //             }
    //         System.out.println();
    //     }
       
    // }

    // Method 2
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0) System.out.print(1 + " ");
            else System.out.print(0 + " ");

}
System.out.println();
}
sc.close();
}
}

