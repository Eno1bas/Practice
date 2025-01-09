import java.awt.geom.Area;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int p= scan.nextInt();
        int t= scan.nextInt();
        int r= scan.nextInt();
        float SI= p*t*r/100;
        System.out.println("the SI is " + SI);
    }

}