abstract class Shape {
  public void display() {
    System.out.println("This is a shape");
  }

  public abstract double calculateArea();

  public abstract double calculatePerimeter();
}

class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }
}

class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double calculateArea() {
    return length * width;
  }

  public double calculatePerimeter() {
    return 2 * (length + width);
  }
}

public class Q2 {
  public static void main(String[] args) {
    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4, 6);

    circle.display();
    System.out.println("Area of circle: " + circle.calculateArea());
    System.out.println("Perimeter of circle: " + circle.calculatePerimeter());

    rectangle.display();
    System.out.println("Area of rectangle: " + rectangle.calculateArea());
    System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());
  }
}
