package question3;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void computeArea() {
        area = this.length * this.width;
        System.out.println("Rectangle compute area is: " + area);
    }

    public void computePerimeter() {
        perimeter = (2 * this.length) + (2 * this.width);
        System.out.println("Rectangle compute perimeter is: " + perimeter);
    }

}
