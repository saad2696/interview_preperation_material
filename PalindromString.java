import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = s.next();
        int length = str.length();
        String revString = "";
        for (int i = length - 1; i >= 0; i--) {
            revString = revString + str.charAt(i);
        }
        if (revString.equals(str)) {
            System.out.println("Palindrome String!");
        } else {
            System.out.println("Not a Palindrome!");
        }

    }

}
