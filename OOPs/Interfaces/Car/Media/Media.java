package OOPs.Interfaces.Car.Media;

public class Media implements MediaPlayer{
    @Override
    public void start() {
        System.out.println("Start Media Player");
    }

    @Override
    public void stop() {
        System.out.println("Stop Media Player");
    }
}
