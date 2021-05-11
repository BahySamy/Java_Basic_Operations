import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float x = sc.nextFloat();
        System.out.print("Enter your second number: ");
        float y = sc.nextFloat();
        if(Math.abs(x-y) <= .01){
            System.out.println("your numbers are the same");
        }else{
            System.out.println("your numbers are different");
        }
    }
}
