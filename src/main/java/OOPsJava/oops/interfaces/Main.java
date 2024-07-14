package OOPsJava.oops.interfaces;

public class Main {
    public static void main(String[] args) {
        NiceCar car = new NiceCar();
        ElectricEngine electric = new ElectricEngine();
        car.start();
        car.startMusic();
        car.degradeEngine(electric);
        car.accelerate();
        car.stopMusic();
        car.stop();
    }
}
