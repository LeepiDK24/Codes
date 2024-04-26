public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n=arr.length;
        // Method1
        // for(int i=0;i<n/2;i++){
        //     int temp = arr[i];
        //     arr[i]=arr[n-i-1];
        //     arr[n-i-1]=temp;
        // }

        // Method 2

        // public static void swapN(int[] arr,int i,int j){
        //     int temp = arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=temp;
        // }
        
        int i=0;
        int j=n-1;
        // part of array reverse 
        // int i=2,j=5
        while(i<=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
       
    }
}
