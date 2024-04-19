import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x");
        int x=sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Element found at index"+ i);
                break;
            }
        }
        sc.close();
        
    }

}
