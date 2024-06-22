import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 0;

        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= nsp; sp++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            nsp++;

        }
    }
}