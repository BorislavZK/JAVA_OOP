package TEST;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        //upper part
        for (int row = 1; row <= n - 1; row++) {
            printRow(n, row);
        }


        //mid part
        for (int star = 1; star <= n; star++) {
            System.out.print("* ");
        }
        System.out.println();


        //lower part
        for (int row = n - 1; row >= 1; row--) {
            printRow(n, row);

        }
    }

    private static void printRow(int n, int row) {


        for (int space = 1; space <= n - row; space++) {
            System.out.print(" ");
        }

        for (int star = 1; star <= row; star++) {
            System.out.print("* ");

        }

        System.out.println();
    }
}
