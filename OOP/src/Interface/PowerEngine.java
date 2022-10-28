package Interface;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine Stars");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine Accelerate");
    }
}
