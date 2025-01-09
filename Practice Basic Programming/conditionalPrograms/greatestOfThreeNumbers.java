package conditionalPrograms;

import java.util.Scanner;

public class greatestOfThreeNumbers {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("provide A, B, C values");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a==b&&b==c){
            System.out.println("A B C values are equal");
        }
        else if(a>b&&a>c){
            System.out.println(a+" is greater");
        }
        else if(b>a&&b>c){
            System.out.println(b+" is greater");
        }
        else {
            System.out.println(c+" is greater");
        }
    }
}
