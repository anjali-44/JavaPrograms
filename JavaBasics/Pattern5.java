import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = n/2 + 1;
        int nsp = 1;

        for (int row = 1; row <= n; row++) {
            for (int st = 1; st <= nst; st++) {
                System.out.print("*");
            }
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= nst; st++) {
                System.out.print("*");
            }

            System.out.println();

            if (row <= n/2) {
                nst--;
                nsp +=2;
            }
            else {
                nst++;
                nsp -=2;
            }
        }

    }
}