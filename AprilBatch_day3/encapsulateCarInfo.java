package AprilBatch_day3;
class Car {
    private boolean engineOn;
    private int speed;
    private double fuelLevel;

    public void startEngine() {
        engineOn = true;
        System.out.println("Engine started");
    }

    public void setSpeed(int speed) {
        if (engineOn && speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Cannot set speed. Start engine first.");
        }
    }

    public void setFuelLevel(double fuel) {
        if (fuel >= 0) {
            this.fuelLevel = fuel;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}

public class encapsulateCarInfo {
    public static void main(String[] args) {
        Car car = new Car();

        car.setFuelLevel(50);
        car.startEngine();
        car.setSpeed(80);

        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Fuel Level: " + car.getFuelLevel());
    }
}
