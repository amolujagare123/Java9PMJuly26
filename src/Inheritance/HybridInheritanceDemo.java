package Inheritance;// Hybrid Inheritance Example (Hierarchical + Multilevel combined)
//
//                Animal (eat)
//                /          \
//           Mammal          Reptile
//           (walk)          (crowl)
//             |
//           Tiger
//           (roar)
//
// Animal -> Mammal, Reptile   : Hierarchical Inheritance
// Mammal -> Tiger             : Multilevel Inheritance
// Together                    : Hybrid Inheritance

class Animal2 {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Mammal extends Animal2 {
    void walk() {
        System.out.println("Mammal is walking...");
    }
}

class Reptile extends Animal2 {
    void crowl() {
        System.out.println("Reptile is crawling...");
    }
}

class Tiger extends Mammal {
    void roar() {
        System.out.println("Tiger is roaring...");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {

        // Reptile object - single level from Animal (Hierarchical branch)
        Reptile r = new Reptile();
        r.crowl();
        r.eat();

        System.out.println();

        // Mammal object - single level from Animal (Hierarchical branch)
        Mammal m = new Mammal();
        m.walk();
        m.eat();

        System.out.println();

        // Tiger object - inherits through Mammal -> Animal (Multilevel branch)
        Tiger t = new Tiger();
        t.roar();   // Tiger's own method
        t.walk();   // Inherited from Mammal
        t.eat();    // Inherited from Animal
    }
}
