import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n=sc.nextInt();
        System.out.println("Enter student marks");
        int[] marks = new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(marks[i]<=35){
                System.out.println("Roll no : "+ i);
            }
        }
        sc.close();
    }
}
