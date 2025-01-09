package conditionalPrograms;

import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a,b values");
        int a= scan.nextInt();
        int b= scan.nextInt();

        System.out.println("Enter operator:\nadd +\nsub -\nmul *");
        char operator = scan.next().charAt(0);

        if(operator== '+'){
            System.out.println("sum ="+(a+b));
        }
        else if(operator== '-'){
            System.out.println("sub ="+(a-b));
        }
        else if (operator== '*') {
            System.out.println("mul ="+(a*b));
        }
    }
}
