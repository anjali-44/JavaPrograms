import java.util.Scanner;

public class FrequencyNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int d = scn.nextInt();
        int count = 0;

        while (n != 0) {
            int rem = n % 10;
            n = n / 10;

            if (rem == d) {
                count++;
            }
        }
        System.out.println(count);
    }
}