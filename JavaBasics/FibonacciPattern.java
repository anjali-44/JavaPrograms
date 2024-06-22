import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int a = -1;
        int b = 1;
        int nst = 1;

        for (int row = 1; row <= n; row++) {
            for (int st = 1; st <= nst; st++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;

            }
            System.out.println();
            nst++;
        }


    }
}