package InterfaceDemo;

interface MyInterface1
{
    void start();
    void run();
    void display();
}

interface MyInterface2
{
    void display();
}

class MyClass implements MyInterface1,MyInterface2
{

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}

public class TestMultipleInheritance {

    public static void main(String[] args) {

        MyInterface1 it1 = new MyClass();

        it1.display();

        MyInterface2 it2 = new MyClass();
        it2.display();


    }
}
