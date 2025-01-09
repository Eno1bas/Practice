package conditionalPrograms;

import java.util.Scanner;

public class sumOfEvenNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    System.out.println("Enter Number Range");
    int range = scan.nextInt();
    int n = 1;
    System.out.println("Even numbers up to " + range + ":");
    while (n<=range){
     if ( n % 2 == 0){
         System.out.println(n);
     }
     n++;
    }
    }
}
