package CollectionsDemo;

import java.util.LinkedHashMap;

public class MapsDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(1, "Apple");
        lhm.put(2, "Banana");
        lhm.put(3, "Cherry");
        lhm.put(4, "Date");
        lhm.put(5, "Elderberry");
        lhm.put(6, "Fig");
        lhm.put(7, "Grape");
        lhm.put(8, "Honeydew");

        System.out.println(lhm);

        System.out.println(lhm.get(6));
       lhm.remove(6);

        System.out.println(lhm);

        System.out.println(lhm.containsKey(6));
        System.out.println(lhm.containsValue("Apple"));

    }
}
