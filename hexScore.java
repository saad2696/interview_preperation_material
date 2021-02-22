import java.util.Scanner;

public class hexScore {
    public static void main(String[] args) {
        String[] toHexa;
        toHexa = new String[21];
        int length = toHexa.length;
        for (int i = 0; i < length; i++) {
            Scanner s = new Scanner(System.in);
            int count = i + 1;
            System.out.println("Enter your Score Number: " + count);
            String score = s.next();
            int record = Integer.parseInt(score);
            toHexa[i] = Integer.toHexString(record);

        }
        for (int i = 0; i < length; i++) {
            System.out.print(toHexa[i]);
            if(toHexa[i]!=toHexa[length - 1]){
                System.out.print("-");
            }
        }
        System.out.println();

    }

}
