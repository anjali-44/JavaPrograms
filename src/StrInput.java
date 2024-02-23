import java.util.Scanner;

public class StrInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();

        String[] str = new String[size];

        for (int i = 0; i < size; i++) {
            str[i] = scn.next();

        }

        System.out.println("your entered string array is : ");


        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}