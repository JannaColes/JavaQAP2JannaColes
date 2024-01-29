public class TestMyLine {
  public static void main(String[] args) {
    MyLine line1 = new MyLine(1, 2, 4, 6);
    MyLine line2 = new MyLine(new MyPoint(0, 0), new MyPoint(3,4));

    // Test all public methods
    System.out.println("Line 1: " + line1.toString());
    System.out.println("Line 2: " + line2.toString());

    System.out.println("Length of line 1: " + line1.getLength());
    System.out.println("Length of Line 2: " + line2.getLength());

    System.out.println("Gradient of Line 1: " + line1.getGradient());
    System.out.println("Gradient of Line 2: " + line2.getGradient());
  }
}
