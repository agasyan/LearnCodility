import A_Iterations.BinaryGap;
import B_Arrays.CyclicRotation;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main (String[]args) {
        boolean check = true;
        while (check) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("=======================================================");
            System.out.println("Enter a command :");
            String input = scanner.nextLine();
            if (input.equals("binaryGap")) {
                BinaryGap binaryGap = new BinaryGap();
                System.out.println("Enter a number for binary gap command :");
                int inInt = scanner.nextInt();
                int answer = binaryGap.solution(inInt);
                System.out.println("Longest binary gap in " + inInt + " is " + answer + "\n");
            } else if (input.equals("list")) {
                String list = "1. 'binaryGap' \n" +
                        "2. 'cyclicRotation' \n" +
                        "3. 'end' \n";
                System.out.println(list);
            } else if (input.equals("cyclicRotation")) {
                CyclicRotation cyclicRotation = new CyclicRotation();
                int[] A = new int[] {3, 8, 9, 7, 6};
                int[] arrSol = cyclicRotation.solution(A,1);
                String out = Arrays.toString(arrSol);
                System.out.println(out);
            } else if (input.equals("end")){
                check = false;
            } else {
                System.out.println("Not Listed");
            }
        }
        System.out.println("\nMain Ended");
    }
}
