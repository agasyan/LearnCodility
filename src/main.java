import A_Iterations.BinaryGap;
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
                int answer = binaryGap.solution(51712);
                System.out.println(answer + "\n");
            } else if (input.equals("list")) {
                String list = "1. 'binaryGap' \n" +
                        "2. 'end' \n";
                System.out.println(list);
            } else if (input.equals("end")){
                check = false;
            } else {
                System.out.println("Not Listed");
            }
        }
        System.out.println("\nMain Ended");
    }
}
