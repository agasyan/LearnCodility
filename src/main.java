import A_Iterations.BinaryGap;
import B_Arrays.CyclicRotation;
import B_Arrays.OddOccurrencesInArray;
import C_TimeComplexity.FrogJmp;
import C_TimeComplexity.PermMissingElem;
import C_TimeComplexity.TapeEquilibrium;
import D_CountingElements.FrogRiverOne;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main (String[]args) {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        String[] list = new String[]{"binaryGap","list","cyclicRotation"
                ,"oddOccurencesInArray", "frogJmp", "permMissingElem"
                , "tapeEquilibrium","frogRiverOne","end"};
        for (int i = 0; i<list.length; i++) {
            System.out.println(i+1 + ". '" + list[i] + "'");
        }
        while (check) {
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
            } else if (input.equals("tapeEquilibrium")) {
                TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
                int[] A = new int[]{-3,-1,-2,-4,-3};
                int sol = tapeEquilibrium.solution(A);
                System.out.println(sol);
            } else if (input.equals("frogJmp")) {
                FrogJmp frogJmp = new FrogJmp();
                int sol = frogJmp.solution(10,100, 30);
                System.out.println(sol);
            } else if (input.equals("frogRiverOne")) {
                FrogRiverOne frogRiverOne = new FrogRiverOne();
                int[] A = new int[]{1, 3, 1, 4, 2, 3, 5, 4};
                int sol = frogRiverOne.solution(5,A);
                System.out.println(sol);
            } else if (input.equals("permMissingElem")) {
                PermMissingElem permMissingElem = new PermMissingElem();
                int[] A = new int[]{2,3,1,5};
                int sol = permMissingElem.solution(A);
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
