import java.util.Scanner;

public class V_UserInput {
    public static void main(String a[]){
        System.out.print("Please enter a number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("You entered " + num);
    }
}
