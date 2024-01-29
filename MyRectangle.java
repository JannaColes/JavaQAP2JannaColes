/*
MyRectangle         ------------
-topLeft: MyPoint
-bottomRight: MyPoint
------------
+MyRectangle(x1:int, y1:int, x2:int, y2:int)

+MyRectangle(topLeft: MyPoint, bottomRight: MyPoint)

+getTopLeft(): MyPoint

+setTopLeft(topLeft: MyPoint):void

getBottomRight(): MyPoint

setBottomRight(bottomRight: MyPoint):void

getWidth(): double

getHeight(): double

getArea(): double

getPerimeter(): double

toString(): String
------------
 */

public class MyRectangle {
  private MyPoint topLeft;
  private MyPoint bottomRight;

  public MyRectangle(int x1, int y1, int x2, int y2) {
    this.topLeft = new MyPoint(x1, y1);
    this.bottomRight = new MyPoint(x2, y2);
  }
  
  public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
    this.topLeft = topLeft;
    this.bottomRight = bottomRight;
  }

  public MyPoint getTopLeft() {
    return topLeft;
  }

  public void setTopLeft(MyPoint topLeft) {
    this.topLeft = topLeft;
  }

  public MyPoint getBottomRight() {
    return bottomRight;
  }

  public void setBottomRight(MyPoint bottomRight) {
    this.bottomRight = bottomRight;
  }

  public double getWidth() {
    return Math.abs(bottomRight.getX() - topLeft.getX());
  }

  public double getHeight() {
    return Math.abs(bottomRight.getY() - topLeft.getY());
  }

  public double getArea() {
    return getWidth() * getHeight();
  }

  public double getPerimeter() {
    return 2 * (getWidth() + getHeight());
  }

  public String toString() {
    return "MyRectangle[topLeft=" + topLeft.toString() + ", bottomRight=" + bottomRight.toString() + "]";
  }


}
  

