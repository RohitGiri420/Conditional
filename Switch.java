import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number between 1 - 5 : ");
        int num = sc.nextInt();

        switch(num){
            case 1 : System.out.print("hii"); break;

            case 2 : System.out.print("hello"); break;

            case 3 : System.out.println("kaise ho"); break;

            case 4 : System.out.println("chulla jao ghahr"); break;

            case 5 : System.out.println("byy byy"); break;

            default :System.out.println("you entered wrong number ");
        }
    }
}
