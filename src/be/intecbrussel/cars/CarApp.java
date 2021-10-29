package be.intecbrussel.cars;

public class CarApp {
    public static void main(String[] args) {
        ElectricalCar electricalCar = new ElectricalCar();
        System.out.println(electricalCar.getBatteryPercentage());
        electricalCar.charge();
        System.out.println("Our battery: " + electricalCar.getBatteryPercentage());

        electricalCar.setColor("Pink");
        System.out.println(electricalCar.getColor());
        electricalCar.accelerate();
        electricalCar.decelerate();
    }
}
