import java.net.Socket;
import java.util.Scanner;

public class daysOfWeek {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("enter a number : ");
     int Day = sc.nextInt();
     
     switch (Day) {
        case 1:
            System.out.println("monday");
            break;
     
        case 2:
            System.out.println("tuesday");
            break;

        case 3:
            System.out.println("wednesday");
            break;

        case 4:
            System.out.println("thursday");
            break;

        case 5:
            System.out.println("friday");
            break;

        case 6:
            System.out.println("Saturday");
            break;

        case 7:
            System.out.println("Sunday");
            break;

        default:
        System.out.println("wrong input");
            break;
     }
    }
}
