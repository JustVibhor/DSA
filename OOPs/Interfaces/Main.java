package OOPs.Interfaces;

import OOPs.Interfaces.Car.Car;

public class Main implements B {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        car.startMusic();
        car.upgradeEngine();
        car.start();
        car.emergency();

    }

    @Override
    public void funcA() {
        System.out.println("Func A");
    }

    @Override
    public void funcB() {
        System.out.println("Func B");
    }
}
