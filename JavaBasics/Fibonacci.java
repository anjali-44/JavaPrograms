import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rowVal = scn.nextInt();
        int a = 0;
        int b = 1;

//        for (int row = 1; row <= rowVal; row++) {

            for(int i = 0; i <= n ; i++) {
                if (i == 0 || i == 1) {
                    System.out.println(i);
                } else {

                    int c = a + b;
                    if (c <= n) {
                        System.out.println(c);

                        a = b;
                        b = c;
                    }
                }
//
            }
    }
}