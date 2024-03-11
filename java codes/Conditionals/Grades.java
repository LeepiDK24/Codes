import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int n = sc.nextInt();
        if(n>=81) System.out.println("Very good");
        else if(n>=61) System.out.println("Good");
        else if(n>41) System.out.println("Avg");
        else System.out.println("Fail");
        sc.close();
    }
}
