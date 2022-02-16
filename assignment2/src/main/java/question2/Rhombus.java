package question2;

public class Rhombus extends Shape {
    double diagonal_d1;
    double diagonal_d2;

    public Rhombus(String name, int color, double diagonal_d1, double diagonal_d2) {
        super(name, color);
        this.diagonal_d1 = diagonal_d1;
        this.diagonal_d2 = diagonal_d2;
    }

    public Rhombus(String name, int color, double diagonal_d1) {
        super(name, color);
        this.diagonal_d1 = diagonal_d1;
        this.diagonal_d2 = diagonal_d1;
    }

    @Override
    public double getArea() {
        return (diagonal_d1 * diagonal_d2) / 2;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(2) * 2 * diagonal_d1;
    }

    public double getDiagonal_d1() {
        return diagonal_d1;
    }

    public void setDiagonal_d1(double diagonal_d1) {
        this.diagonal_d1 = diagonal_d1;
    }

    public double getDiagonal_d2() {
        return diagonal_d2;
    }

    public void setDiagonal_d2(double diagonal_d2) {
        this.diagonal_d2 = diagonal_d2;
    }

    public void Rhombus(double diagonal_d1) {
        diagonal_d2 = diagonal_d1;
    }
}
