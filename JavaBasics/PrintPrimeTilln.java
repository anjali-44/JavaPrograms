import java.util.Scanner;

public class PrintPrimeTilln {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        for (int i = a; i <= b; i++) {

            if (i == 0 || i == 1) {
                continue;
            }
            if (i == 2 || i ==3) {
                System.out.println(i);
            }

            boolean isPrime = true;
            for (int j = 2; j*j <= i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }


    }
}