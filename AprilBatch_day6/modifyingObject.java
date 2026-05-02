package AprilBatch_day6;
class Box {
    int length;

    Box(int l) {
        length = l;
    }
}

class modifyingObject {
    static void modify(Box b) {
        b.length = b.length + 10;
        System.out.println("Inside method: " + b.length);
    }

    public static void main(String[] args) {
        Box b1 = new Box(5);
        System.out.println("Before method call: " + b1.length);
        modify(b1);
        System.out.println("After method call: " + b1.length);
    }
}
