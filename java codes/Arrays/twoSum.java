import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter target");
        int target = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       
        for(int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]+arr[j]==target){
                    System.out.println(i + " "+j);
                }
        }
    }
    sc.close();
}
}
