import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float x = sc.nextFloat();
        System.out.print("Enter your second number: ");
        float y = sc.nextFloat();
        System.out.print("Enter your third number: ");
        float z = sc.nextFloat();

        if (x > y) {
            if (x > z) {
                System.out.println("The greatest number is : " + x);
            } else {
                System.out.println("The greatest number is : " + z);
            }
        } else if (y > z) {
            if (y > x) {
                System.out.println("The greatest number is : " + y);
            } else {
                System.out.println("The greatest number is : " + x);
            }
        }else if (z>x){
            if (z>y){
                System.out.println("The greatest number is : " + z);
            }else {
                System.out.println("The greatest number is : " + y);
            }
        }
    }
}