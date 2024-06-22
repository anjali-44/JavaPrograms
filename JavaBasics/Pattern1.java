import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = 1;
        int spaces = n - 1;

        for (int row = 1; row <= n; row++) {

            for (int st = 1; st <= star; st++) {
                System.out.print("*\t");
            }
            for (int sp = 1; sp <= spaces; sp++) {
                System.out.print(" ");

            }
            System.out.println();
            star++;
            spaces--;
        }
    }
}