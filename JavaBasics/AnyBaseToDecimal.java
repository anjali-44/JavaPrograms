import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        AnyToAny(n,b1,b2);

//        DecToAny(n,b);

    }
    public static int AnytoDec(int n, int b) {
        int ans = 0;
        int place = 1;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;

            ans = ans + rem * place;
            place = place * b;
        }
//        System.out.println(ans);
        return ans;
    }

    public static int DecToAny(int n, int b) {
        int ans = 0;
        int place = 1;

        while (n > 0) {
            int rem = n % b;
            n = n / b;
            ans = ans + rem * place;
            place = place * 10;
        }
//        System.out.println(ans);
        return ans;
    }

    public static void AnyToAny(int n, int b1, int b2) {
        int n1 = AnytoDec(n,b1);
        int n2 = DecToAny(n1,b2);

        System.out.println(n2);

    }


}