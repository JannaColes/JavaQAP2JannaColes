public class MyPoint {
  private int x;
  private int y;

  // Constructors for MyPoint
  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }
 // Getters and Setters for x and y coordinates
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

// Getters and Setters for x and y coordinates as an array
  public int[] getXY() {
    return new int[]{x, y};
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

// toString() method
  public double distance(int x, int y) {
    int xDiff = this.x - x;
    int yDiff = this.y - y;
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }

  public double distance(MyPoint another) {
    int xDiff = this.x - another.x;
    int yDiff = this.y - another.y;
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }

  public String toString() {
    return "(" + x + "," + y + ")";
  }




}