public class MyLine {
  private MyPoint begin;
  private MyPoint end;

  // Constructors
  
  public MyLine(int x1, int y1, int x2, int y2) {
    this.begin = new MyPoint(x1, y1);
    this.end = new MyPoint(x2, y2);
  }

  public MyLine(MyPoint begin, MyPoint end) {
    this.begin = begin;
    this.end = end;
  }

  // Getters and Setters fr begin and end

  public MyPoint getBegin() {
    return begin;
  }

  public void setBegin(MyPoint begin) {
    this.begin = begin;
  }

  public MyPoint getEnd() {
    return end;
  }

  public void setEnd(MyPoint end) {
    this.end = end;
  }

  // Getters and Setters for x and y coordinates of begin and end

  public int getBeginX() {
    return begin.getX();
  }

  public void setBeginX(int x) {
    begin.setX(x);
  }

  public int getBeginY() {
    return begin.getY();
  }

  public void setBegin(int y) {
    begin.setY(y);
  }

  public int getEndX() {
    return end.getX();
  }

  public void setEndX(int x) {
    end.setX(x);
  }

  public int getEndY() {
    return end.getY();
  }

  public void setEndY(int y) {
    end.setY(y);
  }

  // Getters and Setters for XY coordinates of begin and end
  
  public int[] getBeginXY() {
    return begin.getXY();
  }

  public void setBeginXY(int x, int y) {
    begin.setXY(x, y);
  }

  public int[] getEndXY() {
    return end.getXY();
  }

  public void setEndXY(int x, int y) {
    end.setXY(x, y);
  }

  public double getLength() {
    return begin.distance(end);
  }

  public double getGradient() {
    int diffY = end.getY() - begin.getY();
    int diffX = end.getX() - begin.getX();
    return Math.atan2(diffY, diffX);
  }

  public String toString() {
    return "MyLine[begin=" + begin.toString() + ", end=" + end.toString() + "]";
  }





}
