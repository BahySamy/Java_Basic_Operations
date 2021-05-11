import java.util.Locale;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your letter: ");
        String x = sc.next().toLowerCase();
        String voels = "aeoui";
        String alphapet = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        if (x.length() != 1) {
            System.out.println("Not a single letter");

        }else if (!(Character.isLetter(x.charAt(0)))) {
            System.out.println("it is not a letter");

        }else if (x.charAt(0) == voels.charAt(0) || x.charAt(0) == voels.charAt(1) || x.charAt(0) == voels.charAt(2) || x.charAt(0) == voels.charAt(3) || x.charAt(0) == voels.charAt(4)) {
            System.out.print("it is a vowel");

        } else {
            for (int i = 0; i < alphapet.length(); i++) {
                if (x.charAt(0) == alphapet.charAt(i)) {
                    System.out.println("it is a consonant");
                    break;
                }
            }
        }

    }
}

