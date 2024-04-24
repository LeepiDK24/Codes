// import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {20,45,67,889,35};
    
    for(int ele : arr){
        System.out.print(ele + " ");
    }

    System.out.println();
    // shallow copy---->>no new array formed bass naam ek extra mil gya h to the previous array
    // int[] nums=arr;
    // for(int ele : nums){ 
    //     System.out.print(ele + " ");
    // }

    // deep Copy -->> new array formed  ,1
//     int[] nums = Arrays.copyOf(arr,arr.length);
//     for(int ele : nums){
//         System.out.print(ele + " ");
 
//    }
//    System.out.println();
//    nums[2]= 54;
//    System.out.println(nums[2]);
//    System.out.println(arr[2]);

//    deep Copy m2
int[] crr=new int[arr.length];
for(int i=0;i<arr.length;i++){
    crr[i] = arr[i];
}
}
}

