package Inheritance;

public class Employee {

    int salary = 50000;

    void  empWork()
    {
        System.out.println("emp work");
    }
}

class Tester extends Employee
{
    int bonus = 20000;

    void testersWork()
    {
        System.out.println("testersWork");
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        System.out.println(tester.bonus);
        tester.testersWork();

        System.out.println(tester.salary);
        tester.empWork();
    }
}
