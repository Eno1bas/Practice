package conditionalPrograms;

import java.util.Scanner;

public class Characteridentifier {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter character");
        char ch=scan.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("Upper case Alphabet");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Lower case Alphabet");
        }
        else if(ch >='0' && ch<='9'){
            System.out.println("Digits");
        }
        else
            System.out.println("Special character");
    }
}
