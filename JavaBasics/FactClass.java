import java.util.Scanner;

public class FactClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Factorial num = new Factorial();
        int ans = num.FactNum(n);
        System.out.println(ans);
    }

}