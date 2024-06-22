import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int star = n;
        int spaces = 0;

        for (int row = 1; row <= n; row++) {

            for (int sp = 1; sp <= spaces; sp++ ) {
                System.out.print(" ");
            }
            for (int st = 1; st <= star; st++) {
                System.out.print("*");

            }

            System.out.println();
            star--;
            spaces++;
        }
    }
}