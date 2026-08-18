package CollectionsDemo.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {

    public static void main(String[] args) {

        TreeSet hs = new TreeSet();
        hs.add("Ravi");
        hs.add("Vijay");
        hs.add("Ajay");
        hs.add("Anuj");

        System.out.println(hs.add("Anuj"));
        System.out.println(hs);
    }
}
