package C_TimeComplexity;

import java.lang.Math;

public class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        for (int i = 0;i<A.length;i++) {
            sum+=A[i];
        }
        int min = 0;
        int sumNow =0;
        for (int p = 0;p<A.length-1;p++) {
            sumNow+=A[p];
            int tmpMin = Math.abs(sumNow-(sum-sumNow));
            if (p==0) min = tmpMin;
            else if (tmpMin<=min) min = tmpMin;
        }
        return min;
    }
}
