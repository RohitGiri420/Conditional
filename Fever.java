import java.util.Scanner;
public class Fever {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     
     System.out.print("enter your temperature : ");
     int temperature = sc.nextInt();

     if(temperature<100){
        System.out.println("Dont Worry! you dont have fever");
     }

     else if(temperature>100 && temperature <= 104){
        System.out.println("you have fever");
     }
     else{
        System.out.println("You are legend my dear friend");
     }
    }
}
