package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemove {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("swapna");
        al.add("reena");
        al.add("vishal");
        al.add("girish");

        System.out.println(al);

      //  al.remove("girish");
        al.remove(2);

        System.out.println(al);







    }
}
