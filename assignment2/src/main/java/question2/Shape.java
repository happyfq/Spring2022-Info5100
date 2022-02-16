package question2;

public class Shape {
    String name;
    int color;
    double area;
    double perimeter;
    public Shape(String name, int color, double area, double perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }
    public Shape(String name, int color) {
        this.name = name;
        this.color = color;
    }

    public void printShape(){
        System.out.println("Name:" + this.name+" | Color:"+this.color+" | Area:"+getArea()
        +" | Perimeter:"+getPerimeter());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}