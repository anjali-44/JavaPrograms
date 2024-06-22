import java.util.Scanner;

public class NumPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int num = 1;

        for (int row = 1; row <= n; row++) {
            for (int st = 1; st <= nst; st++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            nst++;
        }
    }
}