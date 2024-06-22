import java.util.Scanner;

public class OctalToDec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int ans = 0;
        int place = 1;

        while (n > 0) {
            int rem = n % 10;
            n = n /10;

            ans = ans + rem * place;
            place = place * 8;
        }
        System.out.println(ans);
    }
}