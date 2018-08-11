package B_Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        for(int i = 0;i<K;i++) {
            int firstInt = A[0];
            for (int j = A.length-1;j>0;j--) {
                if (j==A.length-1) {
                    A[0] = A[j];
                    A[j] = A[j-1];
                } else if (j-1 == 0){
                    A[j] = firstInt;
                } else {
                    A[j] = A[j-1];
                }
            }
        }
        return A;
    }
}
