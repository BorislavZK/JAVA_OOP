package _02_PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    Scanner scan = new Scanner(System.in);

    int[] rectangleCoordinates = Arrays.stream(scan.nextLine().split("\\s+"))
            .mapToInt(Integer::parseInt).toArray();

}
