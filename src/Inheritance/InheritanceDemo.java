package Inheritance;

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("BabyDog is weeping...");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        // Animal object - only has access to eat()
        Animal a = new Animal();
        a.eat();

        System.out.println("-----");

        // Dog object - inherits eat() from Animal (1 copy), has its own bark()
        Dog d = new Dog();
        d.bark();
        d.eat();

        System.out.println("-----");

        // BabyDog object - inherits bark() from Dog (1 copy),
        // which in turn inherits eat() from Animal, plus its own weep()
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
