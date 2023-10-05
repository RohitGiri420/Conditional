import java.util.Scanner;

public class posNegNum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("enter number : ");
        int num = Sc.nextInt();

        if(num>=0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("number is neative");
        }


    }
}
