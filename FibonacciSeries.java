public class FibonacciSeries {
    public static void main(String[] args) {
        int sum = 0;
        int n1 = 0;
        int n2 = 1;
        System.out.println("Fibonacci Series: "+n1+" "+n2);
        for (int i = 0; i < 10; i++) {

            sum = n1+n2;
            System.out.println(sum);
            n1=n2; 
            n2=sum;

        }
    }
}
