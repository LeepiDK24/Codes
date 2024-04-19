import java.util.Scanner;

public class maxValue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    int n=sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter Array elements");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    // Maximum element
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        max=Math.max(max,arr[i]);
    }

    // 2nd max element

    int smax=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>smax && arr[i]!=max){
        smax=Math.max(smax,arr[i]);
    }
    
  } 
  System.out.println(max);
  System.out.println(smax);
  sc.close(); 
}
}
