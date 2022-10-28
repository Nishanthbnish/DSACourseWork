package Interface;

public class Electric_Engine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric Engine Stars");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine Accelerate");
    }
}
