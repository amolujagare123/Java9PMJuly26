package Inheritance;// Hierarchical Inheritance Example
// Bird is the superclass; Sparrow and Crow are subclasses.
// Both Sparrow and Crow inherit fly() from Bird, and also have their own methods.

class Bird {
    void fly() {
        System.out.println("Bird is flying...");
    }
}

class Sparrow extends Bird {
    void sparrowColor() {
        System.out.println("Sparrow color: Brown");
    }
}

class Crow extends Bird {
    void crowColor() {
        System.out.println("Crow color: Black");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        // Bird object
        Bird b = new Bird();
        b.fly();

        System.out.println();

        // Sparrow object - inherits fly() from Bird, has its own sparrowColor()
        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();

        System.out.println();

        // Crow object - inherits fly() from Bird, has its own crowColor()
        Crow c = new Crow();
        c.crowColor();
        c.fly();
    }
}
