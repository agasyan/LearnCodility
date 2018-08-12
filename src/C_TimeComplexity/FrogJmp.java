package C_TimeComplexity;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int answer = 0;
        while (X<=Y) {
            answer++;
            X=X+D;
        }
        return answer;
    }
}
