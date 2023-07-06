package WorkingWithAbstraction._02_PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] rectangleCoordinates = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        //"{bottomLeftX} {bottomLeftY} {topRightX} {topRightY}".

        int bottomLeftX = rectangleCoordinates[0];
        int bottomLeftY = rectangleCoordinates[1];
        int topRightX = rectangleCoordinates[2];
        int topRightY = rectangleCoordinates[3];

        Point bottomLeftPoint = new Point(bottomLeftX, bottomLeftY);
        Point topRightPoint = new Point(topRightX, topRightY);

        Rectangle rectangle = new Rectangle(bottomLeftPoint, topRightPoint);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int[] coordinatesToCheck = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            Point pointToCheck = new Point(coordinatesToCheck[0], coordinatesToCheck[1]);


            if (rectangle.contains(pointToCheck)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
