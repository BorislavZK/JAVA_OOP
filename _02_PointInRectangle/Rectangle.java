package _02_PointInRectangle;

public class Rectangle {

    Point bottomLeft;
    Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point){

        boolean xAxis = point.getX() <= bottomLeft.getX() && point.getX() <= topRight.getX();
        boolean yAxis = point.getY() <= topRight.getY() && point.getY() <= bottomLeft.getY();

        return xAxis && yAxis;
    }


}
