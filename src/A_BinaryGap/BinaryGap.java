package A_BinaryGap;


public class BinaryGap {
    public static int solution(int N) {
        // write your code in Java SE 8
        String binary = "";
        while (N>0) {
            int tmp = N%2;
            binary = binary + "" +tmp;
            N = N/2;
        }
        String[] binaryArr = binary.split("");
        int ans = 0;
        int max = 0;
        for (int i = binaryArr.length - 1; i>-1 ; i--) {
            if (binaryArr[i].equals("0") && ans == 0) {
                ans ++;
            } else if (binaryArr[i].equals(("1"))) {
                if (ans>max) {
                    max = ans;
                }
                ans = 0;
            } else if (binaryArr[i].equals("0") && i == 0) {
                if (max == 0) max = 0;
            } else if (binaryArr[i].equals("0")) {
                ans++;
            }
        }
        return max;
    }

    public static void main (String[]args) {
        int answer = solution(51712);
        System.out.println(answer);
    }

}
