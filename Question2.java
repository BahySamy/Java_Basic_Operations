import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        float x = sc.nextFloat();
        if (x == 0 ) {
            System.out.println("your number is zero");
        } else if ( x > 0){
            System.out.println("your number is positive");
            }
        else{
            System.out.println("your number is negative");
            }
    }
}
