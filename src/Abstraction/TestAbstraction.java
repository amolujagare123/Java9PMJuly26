package Abstraction;

abstract class Vehicle
{
    abstract void start();
    abstract void run();

    void display()
    {
        System.out.println("display");
    }
}

class VehicleFunction extends Vehicle
{
    void start()
    {
        System.out.println("start");
    }

     void run()
    {
        System.out.println("run");
    }
}




public class TestAbstraction {

    public static void main(String[] args) {
        Vehicle v = new VehicleFunction() ;
        v.run();
        v.start();
        v.display();
    }
}
