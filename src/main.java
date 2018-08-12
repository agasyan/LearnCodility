import A_Iterations.BinaryGap;
import B_Arrays.CyclicRotation;
import B_Arrays.OddOccurrencesInArray;
import C_TimeComplexity.FrogJmp;

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
                String[] list = new String[]{"binaryGap","list","cyclicRotation"
                    ,"oddOccurencesInArray", "frogJmp","end"};
                for (int i = 0; i<list.length; i++) {
                    System.out.println(i+1 + ". '" + list[i] + "'");
                }
            } else if (input.equals("cyclicRotation")) {
                CyclicRotation cyclicRotation = new CyclicRotation();
                int[] A = new int[] {5, -1000};
                int[] arrSol = cyclicRotation.solution(A,1);
                String out = Arrays.toString(arrSol);
                System.out.println(out);
            } else if (input.equals("oddOccurencesInArray")) {
                OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
                int[] A = new int[]{3,3,2,2,9};
                int sol = oddOccurrencesInArray.solution(A);
                System.out.println(sol);
            } else if (input.equals("frogJmp")) {
                FrogJmp frogJmp = new FrogJmp();
                int sol = frogJmp.solution(10,85, 30);
                System.out.println(sol);
            } else if (input.equals("end")){
                check = false;
            } else {
                System.out.println("Not Listed");
            }
        }
        System.out.println("\nMain Ended");
    }
}
