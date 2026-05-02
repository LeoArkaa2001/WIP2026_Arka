package AprilBatch_day6;
class Test1 {
    static void changeValue(int x) {
        x = x + 10;
        System.out.println("Inside method: " + x);
    }

    public static void intToCallByValue(String[] args) {
        int num = 5;
        System.out.println("Before method call: " + num);
        changeValue(num);
        System.out.println("After method call: " + num);
    }
}
