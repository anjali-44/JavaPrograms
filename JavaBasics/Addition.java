import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();

        int answer = AnyBaseAdd(n1, n2, b);
        System.out.println(answer);

    }

    public static int AnyToDec(int n, int b) {
        int ans = 0;
        int place = 1;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;

            ans = ans + rem * place;
            place = place * b;
        }
        return ans;
    }

    public static int AnyBaseAdd(int n1, int n2, int b) {
        int num1 = AnyToDec(n1, b);
        int num2 = AnyToDec(n2, b);

        int sum = num1 + num2;
        int ans = DecToAny(sum, b);

        return ans;

    }

    public static int DecToAny(int n, int b ) {
        int ans = 0;
        int place = 1;

        while (n > 0) {
            int rem = n % b;
            n = n / b;

            ans = ans + rem * place;
            place = place * 10;
        }
        return ans;
    }


}