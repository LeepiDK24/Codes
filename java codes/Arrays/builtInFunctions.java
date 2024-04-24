import java.util.Arrays;
public class builtInFunctions {
    public static void main(String[] args) {
        int[] arr = {20,45,67,889,35};
        
        // for each loop
        for(int ele : arr){
        System.out.print(ele + " ");
    }
    System.out.println();
    Arrays.sort(arr);
    for(int ele : arr){
        System.out.print(ele + " ");
}
}
}