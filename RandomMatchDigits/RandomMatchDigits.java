import java.util.Random;

public class RandomMatchDigits {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(9999) + 1000;
        int num2 = rand.nextInt(9999) + 1000;

        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);

        while (s1.length() < s2.length()) s1 = "0" + s1;
        while (s2.length() < s1.length()) s2 = "0" + s2;

        int matches = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) matches++;
        }

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Matched digits: " + matches);
        if (matches % 2 == 0) {
            System.out.println("Even-matched");
        } else {
            System.out.println("Odd-matched");
        }
    }
}
