public class PassingArrayToMethods {
    
     public static void change(int[] arr){   //  this passing is pass by value
        arr[0]=123;       
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);

       
    }
}
