package Interface;

public class Main
{
    public static void main(String[] args) {
        Engine c = new car();
//        int n = ((car) c).a;
//        System.out.println(n);
//        ((car) c).breake();
//        c.acc();
//        c.stop();
//        c.stop(); this is not a proper way to do it.
    NiceCar car = new NiceCar();
    car.start();
    car.startMusic();
    car.upgradeEngine();
    car.start();
    car.stop();
        car.upgradePowerEngine();
        car.stop();

    }
}
