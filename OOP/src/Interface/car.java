package Interface;

public class car implements Engine,Break
{
    int   a= 10;
    @Override
    public void breake() {
        System.out.println("I break like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I starts like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stops like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I acc like a normal car");
    }
}
