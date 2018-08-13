package D_CountingElements;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int sol = 1;
        for (int i = 0; i<A.length;i++) {
            if (A[i]==sol) sol++;
        }
        return sol;
    }
}
