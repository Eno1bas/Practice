package Loops;

import java.util.Scanner;

public class doWhile {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter max number");
        int max= scan.nextInt();

        int n=1;
       do {
           System.out.println(n);
           n++;
       }  while (n <= max);
       }
    }


/*
initialization
do
{
logic;
updation;
}while(condition)
 */