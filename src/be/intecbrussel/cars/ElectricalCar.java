package be.intecbrussel.cars;

public class ElectricalCar extends Car{
    private double batteryPercentage;

    public double getBatteryPercentage() {
        return batteryPercentage;
    }

    public void charge() {
        while (batteryPercentage < 100) {
            batteryPercentage++;
            System.out.println("Battery: " + batteryPercentage);
        }
    }

    @Override
    public void accelerate() {
        System.out.println("Battery is going lower.");
    }

    @Override
    public void decelerate() {
        System.out.println("Battery is slowing down");
    }


}
