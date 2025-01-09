package Loops;

import java.util.Scanner;

public class forExample {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter max number");
        int max= scan.nextInt();

        for (int n=1; n<=max; n++){
            System.out.println(n);
        }
    }
}

/*
for(initialization;condition;updation)
 */