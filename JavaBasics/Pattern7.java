import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int nst = 1;

        for (int row = 0; row < n; row++) {
            int val = 1;

            for (int st = 0; st < nst; st++) {
                System.out.print(val + " ");
                val = val * (row - st)/(st + 1);
            }
            System.out.println();
            nst++;
        }
    }
}
