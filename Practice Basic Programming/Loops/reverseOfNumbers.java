package Loops;

import java.util.Scanner;

public class reverseOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int num = scan.nextInt();
        int rem, rev = 0;
        int temp = num;

        while(num>0)
        {
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println("Reversed number " + rev);

        if (temp==rev){
            System.out.println("number is a palindrome");
        }
        else
            System.out.println("number is not a palindrome");
    }
}