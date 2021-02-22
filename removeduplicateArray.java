import java.util.Arrays;

public class removeduplicateArray {
    public static void main(String[] args) {
        int[] A = new int[] { 5,3,6,1,3 };
        int K =2 ;
        Solution a = new Solution();
        System.out.println(a.solution(A,K));

    }

}

class Solution {
    public int solution(int[] A , int K) {
        // Arrays.sort(A);
        // Arrays.sort(B);
        // int lengthOfA = A.length;
        // int lengthOfB = B.length;
        // int sumOfA = 0;
        // int sumOfB = 0;
        // int count = 0;
        // int initialA = 0;
        // int initialB = 0;
        // int[] temp;
        // int candidateofA, candidateofB;
        // for (int i = 0; i < lengthOfA; i++) {
        //     sumOfA = sumOfA + A[i];
        // }
        // for (int i = 0; i < lengthOfB; i++) {
        //     sumOfB = sumOfB + B[i];
        // }
        // System.out.println("I am sum of A "+ sumOfA+"  and B "+ sumOfB);
        // if (sumOfA == sumOfB) {
        //     return 0;
        // }

        // if (sumOfA < sumOfB) {
        //     temp = A;
        //     A = B;
        //     B = temp;
        //     sumOfA = 0;
        //     sumOfB = 0;
        //     for (int i = 0; i < A.length; i++) {
        //         sumOfA = sumOfA + A[i];
        //     }
        //     for (int i = 0; i < B.length; i++) {
        //         sumOfB = sumOfB + B[i];
        //     }
        //     System.out.println("I am swapping "+A[2]);
        // }
        // System.out.println("new sum of A "+ sumOfA);
        // while (sumOfA > sumOfB) {

        //     System.out.println("Comparing");
        //     if (initialA < lengthOfA) {
        //         candidateofA = A[initialA];
        //         System.out.println("i should be consoled twice");
        //     } else {
        //         candidateofA = 1;
        //     }
        //     if (initialB < lengthOfB) {
        //         candidateofB = A[initialB];
        //     } else {
        //         candidateofB = 6;
        //         System.out.println("i should be consoled once");
        //     }

        //     if (candidateofA == 1 && candidateofB == 6)
        //         break;
        //     count++;
        //     System.out.println("i am the count " + count);
        //     if ((candidateofA - 1) > (6 - candidateofB)) {
        //         initialA++;
        //         sumOfA = sumOfA + (1 - candidateofA);
        //     } else {
        //         initialB++;
        //         sumOfB = (6 - candidateofB);
        //     }
        // }
        // if (sumOfA > sumOfB)
        //     count = -1;
        // return count;
        int sizeOfArr = A.length;
        int aP = 0;
        int kTracker = 0;
        int difference = 0;
        if (sizeOfArr ==0){
            return 0;
        }

        if (sizeOfArr == 1){
            return A[0];
        }
        for(int i=0;i<sizeOfArr-1;i++){
            
            if(difference > (A[i+1]-A[i])){
                difference = A[i+1]-A[i];
            }else if(kTracker!=K){
                A[i]=A[i+1];
                kTracker++;
            }
        }
      return difference;
    }

}
