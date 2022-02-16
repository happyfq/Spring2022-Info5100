package question3;

public class Shape {
    String name;
    double area;
    double perimeter;

    public Shape() {
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println("Name:" +getClass().getName()+" | Area:"+getArea()+" | Perimeter:"+getPerimeter());
    }
}
