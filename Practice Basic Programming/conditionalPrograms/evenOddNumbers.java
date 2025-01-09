package conditionalPrograms;

import java.util.Scanner;

public class evenOddNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%2==0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
