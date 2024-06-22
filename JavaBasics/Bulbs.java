import java.util.Scanner;

public class Bulbs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row = 1; row<= n; row++) {
            if (row * row <= n) {
                System.out.print(row * row + ", ");
            }
            else {
                break;
            }
        }
    }
}