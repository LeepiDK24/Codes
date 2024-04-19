import java.util.Scanner;

public class basic{
    public static void main(String[] args) {
        // declaring
        int[] arr = new int[7];

        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");
        for(int i=0;i<=6;i++){
            arr[i] = sc.nextInt();
        }
        
        // output
        for(int i=0;i<=6;i++){
            System.out.print(arr[i] + " ");
    }

    // 2nd method to declare
    int arr1[] = {1,2,3,4,5,6,7};
    int len=arr1.length;
    System.out.println(len);
    for(int i=0;i<len;i++){
        System.out.println(arr1[i]);
    }
    sc.close();
}
}