abstract class Shape {

  public abstract double getArea();

  public abstract double getPerimeter();
}

class Rectangle extends Shape {
    private double width;
    private double height;
  
    public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
    }
  
    // Provide an implementation for inherited abstract getArea() method
    public double getArea() {
      return width * height;
    }
  
    // Provide an implementation for inherited abstract getPerimeter() method
    public double getPerimeter() {
      return 2.0 * (width + height);
    }
  }
  public class Main {
    public static void main(String[] args) {
      // Create some shapes and print their details
        double width = 5; double height = 5;
        Shape rectangleOne = new Rectangle(width, height);
        System.out.println(rectangleOne.getArea());
    }
}