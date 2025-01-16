package automation.Vehicle;

public class Race {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.showSpeed();
//        System.out.println(car.getSpeed());
//        car.increaseSpeed(50);
//        car.showSpeed();

        Bicycle bike = new Bicycle();
        bike.setNbrOfGears(5);
        bike.setCurrentGear(4);
        bike.increaseSpeed(50);
        bike.showSpeed();
    }
}
