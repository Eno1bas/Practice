package Loops;

import java.util.Scanner;

public class multiplicationTable {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();

        for (int i = 1; i<=10; n++){
            System.out.println(n +" x " + i + " = ");
        }
}
}
