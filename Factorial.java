public class Factorial {
    public static void main(String[] args) {
         System.out.println("Factorial of 5 is "+ factorial(5)); 
    }


    public static int factorial(int number){
      if(number == 1){
          return 1;
      }else{
          return number*factorial(number-1);
      }
    }
    
}
