package D_CountingElements;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int sol = 0;
        for (int i = 0; i<A.length;i++) {
            if (A[i] == X) {
                sol = i;
                return sol;
            }
            //System.out.println(A[i] +" = " + sol);
        }
        sol = -1;
        return sol;
    }
}
