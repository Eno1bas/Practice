package Loops;

import java.util.Scanner;

public class whileExample {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter max number");
        int max= scan.nextInt();

        int n=1;
        while(n<=max)
        {
            System.out.println(n);
            n++;
        }
    }
}

/*
initialization;
while(condition)
{
logic;
updation:
}
 */