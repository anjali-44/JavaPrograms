public class Factorial {
    public static int FactNum(int num) {
        int fact = 1;
        if (num < 0) {
//            System.out.println("Invalid number.");
            return -1;

        }

        else {
            while (num > 0) {
                fact = fact * num;
                num--;
            }

            return fact;
        }


    }



}