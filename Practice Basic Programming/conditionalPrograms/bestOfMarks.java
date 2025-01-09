package conditionalPrograms;

import java.util.Scanner;

public class bestOfMarks {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first attempt exam mark");
        int firstattempt= scan.nextInt();
        System.out.println("Did you attempt second time");
        String answer= scan.next();
        if (answer.equals("yes")){
            System.out.println("Enter second attempt exam mark");
            int secondattempt= scan.nextInt();
            if (secondattempt>firstattempt){
                System.out.println("final mark "+ secondattempt);
            }
            else
                System.out.println("final mark "+ firstattempt);
        }
        else
            System.out.println("final mark "+ firstattempt);
    }
}
