package OOPs.Interfaces.Car.Engine;

public class ElectricMotor implements Engine{
    @Override
    public void start() {
        System.out.println("Start Electric Motor");
    }

    @Override
    public void stop() {
        System.out.println("Stop Electric Motor");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate Electric Motor");
    }
}
