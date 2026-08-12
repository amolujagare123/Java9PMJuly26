package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListClear {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty()); // true

        al.add("amol");
        al.add("swapna");
        al.add("reena");
        al.add("vishal");
        al.add("girish");
        System.out.println(al.isEmpty()); // false
        System.out.println(al);

        al.clear();
        System.out.println(al.isEmpty()); // true
        System.out.println(al);






    }
}
