package WorkingWithAbstraction;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        //Create a printRow() method to easily reuse code.

        for (int i = 1; i <= n ; i++) {
            printRow(i);

        }

    }

    private static void printRow(int rowNumber) {

        for (int i = 1; i <= rowNumber; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }



}
