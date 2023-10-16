package OOPs.Interfaces.Car.Engine;

public class FuelEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start Fuel Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Fuel Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate Fuel Engine");
    }
}
