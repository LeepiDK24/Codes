import java.util.ArrayList;

public class basicsOfArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(3);
        arr.add(0,10); // index ,element
        arr.add(1,20);
        arr.add(2,30);
        // System.out.println(arr);

        for(int i=0;i<3;i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        arr.set(2, 300);  //to modify

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
        
        arr.add(100); 
        //adding element to the last ===>>> push back
        System.out.println();
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}