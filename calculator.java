import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number 1 : ");
        int num1=sc.nextInt();

         System.out.print("enter operation (+ , - , * , /) : ");
        char op = sc.next().charAt(0);

        System.out.print("enter number 2 : ");
        int num2 = sc.nextInt();


        switch (op) {
            case '+': System.out.println(num1+num2);
                break;

            case '-': System.out.println(num1-num2);
                break;
        
            case '*': System.out.println(num1*num2);
                break;
            
            case '/': System.out.println(num1/num2);
                break;

            default:System.out.println("invalid operator");
                break;
        }
    }
}
