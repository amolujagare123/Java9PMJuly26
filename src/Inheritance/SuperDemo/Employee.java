package Inheritance.SuperDemo;

public class Employee {

    int salary = 50000;

    int phone = 99750000;

    void  empWork()
    {
        System.out.println("emp work");
    }

    Employee()
    {
        System.out.println("Employee Constructor");
    }

    Employee(int a)
    {
        System.out.println("Employee Constructor a="+a);
    }

    void display()
    {
        System.out.println("salary="+salary);
    }
}

class Tester extends Employee
{
    int bonus = 20000;
    int phone = 99751111;

    Tester()
    {
        super(10);
        System.out.println("Tester Constructor");
    }

  //  @Override
    void display()
    {
        System.out.println("bonus="+bonus);
    }

    void testersWork()
    {
        System.out.println("testersWork");
    }

    void printValues()
    {
        System.out.println("phone="+phone);
        System.out.println("phone="+super.phone);
        display();
        super.display();
    }

    public static void main(String[] args) {


        Tester tester1;

        Tester tester = new Tester();

        Employee emp = new Tester(); // up casting

        emp.display();




    }
}
