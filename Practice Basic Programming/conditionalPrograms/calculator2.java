package conditionalPrograms;

import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a,b values");
        int a= scan.nextInt();
        int b= scan.nextInt();

        System.out.println("Enter operator:\nadd +\nsub -\nmul *");
        char operator = scan.next().charAt(0);

        switch (operator){
            case '+': System.out.println("Sum = "+(a+b)); break;
            case '-': System.out.println("Sub = "+(a-b)); break;
            case '*': System.out.println("Mul = "+(a*b)); break;
            default:System.out.println("invalid operator");
        }
    }

}
