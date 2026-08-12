package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListSet {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        al.add("amol");
        al.add("swapna");
        al.add("reena");
        al.add("vishal");
        al.add("girish");

        System.out.println(al);

        al.set(2,"xyz");

        System.out.println(al);





    }
}
