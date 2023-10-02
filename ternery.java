import java.util.Scanner;

public class ternery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a number : ");
        int a = sc.nextInt();
        String val = (a%2==0) ? "even":"odd";

        System.out.println("this number is "+val);

    }
}
