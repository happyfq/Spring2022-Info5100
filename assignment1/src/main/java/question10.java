public class question10 {
    public static void main(String[] args) {
        double width = 2.0;
        double height = 3.0;
        double depth = 4.0;
        Box b =new Box(width,height,depth);
        System.out.println(b.volume(width,height,depth));
    }
}
class Box {
    double width;
    double height;
    double depth;
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double volume(double width, double height, double depth){
        double v = width * height * depth;
        return v;
    }
}
