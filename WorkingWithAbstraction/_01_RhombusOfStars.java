package WorkingWithAbstraction;

import java.util.Scanner;

public class _01_RhombusOfStars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            printSpaces(i, n);
            printRow(i);

        }
        for (int i = n - 1; i >= 1; i--) {
            printSpaces(i, n);
            printRow(i);
        }
    }
    private static void printSpaces(int i, int n) {
        for (int j = n - i; j >= 1; j--) {
            System.out.print(" ");
        }
    }
    private static void printRow(int rowNumber) {

        for (int i = 1; i <= rowNumber; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
