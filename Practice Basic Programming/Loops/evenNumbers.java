package Loops;

import java.util.Scanner;

public class evenNumbers {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter max number");
        int lw = scan.nextInt(), up= scan.nextInt();
        int sum= 0;
        for (int n = lw; n<= up; n++){
            if (n%2==0)
            {
            System.out.println(n+" ");
            sum=sum+n;
        }
    }
        System.out.println("\nsum = "+ sum);
}
}
