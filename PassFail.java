import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter your marks : ");
        int marks = sc.nextInt();

        String result = (marks>33)? "pass":"fail";

        System.out.println(result);
    }
}
