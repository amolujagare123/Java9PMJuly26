package InterfaceDemo;

interface Vehicle
{
    void start();
    void run();

    static void display1()
    {
        System.out.println("display1");
    }

    default void display2()
    {
        System.out.println("display2");
    }

    private void display3()
    {
        System.out.println("display3");
    }
}

class VehicleFunction implements Vehicle
{

    public void start() {
        System.out.println("start");
    }

    public void run() {
        System.out.println("run");
    }
}

public class TestInterface {

    public static void main(String[] args) {

        Vehicle vehicle = new VehicleFunction();
        vehicle.run();
        vehicle.start();
    }
}
