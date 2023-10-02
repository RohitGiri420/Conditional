import java.util.Scanner;
class largeNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num 1 : ");
        int a = sc.nextInt();

        System.out.print("enter num 2 : ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a+"is Larges ");
        }
        else{
            System.out.println(b+" is largest");
        }
    }
}