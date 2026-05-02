package AprilBatch_day4;

interface Polygon {

    double getArea();

    default double getPerimeter(int... sides) {
        int sum = 0;
        for (int side : sides) {
            sum += side;
        }
        return sum;
    }

    static String shapeInfo() {
        return "Polygons are closed shapes with straight sides.";
    }
}


class Rectangle implements Polygon {
    int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}


class Triangle implements Polygon {
    int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}


public class polygonTest {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 3);
        Triangle t = new Triangle(4, 6);

        System.out.println("Polygon Info: " + Polygon.shapeInfo());

        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter(5, 3, 5, 3));

        System.out.println("Triangle Area: " + t.getArea());
        System.out.println("Triangle Perimeter: " + t.getPerimeter(3, 4, 5));
    }
}
