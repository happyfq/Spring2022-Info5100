package question3;

public class Circle extends Shape {
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void computeArea() {
        area = (this.radius * this.radius) * Math.PI;
        System.out.println("Circle compute area is: " + area);
    }

    public void computePerimeter() {
        perimeter = 2 * Math.PI * this.radius;
        System.out.println("Circle compute perimeter is: " + perimeter);
    }
}
