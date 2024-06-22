import java.util.Scanner;

public class decToBin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ans = 0;
        int place = 1;

        while(n > 0) {
            int rem = n % 2;
            n = n / 2;
            ans = ans + rem * place;
            place = place * 10;
        }
        System.out.println(ans);
    }
}