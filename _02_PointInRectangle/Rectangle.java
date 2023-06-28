package _02_PointInRectangle;

public class Rectangle {

    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point){

        boolean horizontal = this.bottomLeft.getX() <= point.getX() && this.topRight.getX() >= point.getX();
        boolean vertical = this.bottomLeft.getY() <= point.getY() && this.topRight.getY() >= point.getY();

        return horizontal && vertical;

    }



}
