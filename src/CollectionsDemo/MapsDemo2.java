package CollectionsDemo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapsDemo2 {

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


        Set keys = lhm.keySet();
        Collection values = lhm.values();
        Collection entrySet = lhm.entrySet();

        System.out.println("keys="+keys);
        System.out.println("values="+values);
        System.out.println("entrySet="+entrySet);

    }
}
