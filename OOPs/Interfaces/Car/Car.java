package OOPs.Interfaces.Car;

import OOPs.Interfaces.Car.Brake.EmergenyBrake;
import OOPs.Interfaces.Car.Engine.ElectricMotor;
import OOPs.Interfaces.Car.Engine.Engine;
import OOPs.Interfaces.Car.Engine.FuelEngine;
import OOPs.Interfaces.Car.Media.Media;
import OOPs.Interfaces.Car.Media.MediaPlayer;

public class Car {
    private Engine engine;
    private final MediaPlayer media = new Media();
    private final EmergenyBrake brake = new EmergenyBrake();

    public Car() {
        this.engine = new FuelEngine();
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        media.start();
    }

    public void stopMusic() {
        media.stop();
    }

    public void emergency() {
        brake.brake();
    }

    public void upgradeEngine() {
        engine = new ElectricMotor();
    }
}
