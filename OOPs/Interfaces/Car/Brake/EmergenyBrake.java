package OOPs.Interfaces.Car.Brake;

public class EmergenyBrake implements Brake{
    @Override
    public void brake() {
        System.out.println("Emergency Brake STOP!!!");
    }
}
