import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter you Name");
        String str = s.next();
        int length = str.length();
        String  revString="";
        for (int i = length - 1; i >= 0; i--) {
          revString = revString + str.charAt(i);
        }
        System.out.println("The reverse of your name is: "+ revString);
    }
}
