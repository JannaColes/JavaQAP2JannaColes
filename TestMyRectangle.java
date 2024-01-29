public class TestMyRectangle {
  public static void main(String[] args) {
    MyRectangle rectangle1 = new MyRectangle(1, 2, 4, 6);
    MyRectangle rectangle2 = new MyRectangle(new MyPoint(0, 0), new MyPoint(3, 4));

    System.out.println("Rectangle 1: " + rectangle1.toString());
    System.out.println("Rectangle 2: " + rectangle2.toString());

    System.out.println("Width of Rectangle 1: " + rectangle1.getWidth());
    System.out.println("Height of Rectangle 1: " + rectangle1.getHeight());

    System.out.println("Area of Rectangle: " + rectangle1.getArea());
    System.out.println("Perimeter of Rectangle 1: " + rectangle1.getPerimeter());
  }
  
  
}
