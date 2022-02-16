package question2;

public class Triangle extends Shape {
    double side;
    double base;
    double height;

    public Triangle(String name, int color, double base, double height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    public Triangle(String name, int color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
