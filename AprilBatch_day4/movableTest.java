package AprilBatch_day4;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}


class MovablePoint implements Movable {
    int x, y;
    int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y -= ySpeed;
    }

    public void moveDown() {
        y += ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    public String toString() {
        return "Point (" + x + ", " + y + ") Speed(" + xSpeed + "," + ySpeed + ")";
    }
}


class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "Circle Radius: " + radius + " Center: " + center;
    }
}


class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        if (topLeft.xSpeed != bottomRight.xSpeed || topLeft.ySpeed != bottomRight.ySpeed) {
            throw new IllegalArgumentException("Points must have same speed");
        }
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return "Rectangle TopLeft: " + topLeft + " BottomRight: " + bottomRight;
    }
}


public class movableTest {
    public static void main(String[] args) {

        MovablePoint p1 = new MovablePoint(0, 0, 2, 3);
        MovableCircle circle = new MovableCircle(5, p1);

        MovablePoint p2 = new MovablePoint(1, 1, 1, 1);
        MovablePoint p3 = new MovablePoint(4, 4, 1, 1);
        MovableRectangle rect = new MovableRectangle(p2, p3);

        System.out.println("Before Move:");
        System.out.println(circle);
        System.out.println(rect);

        circle.moveRight();
        circle.moveDown();
        rect.moveUp();
        rect.moveLeft();

        System.out.println("\nAfter Move:");
        System.out.println(circle);
        System.out.println(rect);
    }
}