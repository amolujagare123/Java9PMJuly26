package CollectionsDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {

    public static void main(String[] args) {

        LinkedHashSet hs = new LinkedHashSet();
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
