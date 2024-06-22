import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = n/2;
        int nst = 1;

        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= nst; st++) {
                System.out.print("*");
            }
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print(" ");
            }
            System.out.println();

            if (row <= n/2) {
                nsp--;
                nst+=2;
            }
            else {
                nsp++;
                nst-=2;
            }
        }
    }
}