import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nos = n/2;
        int nis = -1;

        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= nos; sp++) {
                System.out.print("\t");
            }
            System.out.print("*\t");

            for (int sp = 1; sp <= nis; sp++) {
                System.out.print("\t");
            }
            if (row != 1 && row != n) {
                System.out.print("*\t");
            }
            System.out.println();

            if (row <= n/2) {
                nos--;
                nis += 2;
            }
            else {
                nos++;
                nis -= 2;
            }
        }
    }
}