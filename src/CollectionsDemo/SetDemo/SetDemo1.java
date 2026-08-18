package CollectionsDemo.SetDemo;

import java.util.HashSet;

public class SetDemo1 {

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add("Ravi");
        hs.add("Vijay");
        hs.add("Ajay");
        hs.add("Anuj");
        hs.add(null);
        hs.add(10);
        System.out.println(hs.add("Anuj"));
        System.out.println(hs);
    }
}
