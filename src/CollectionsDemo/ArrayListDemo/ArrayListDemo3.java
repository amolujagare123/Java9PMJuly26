package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("swapna");
        al.add("reena");
        al.add("vishal");
        al.add("girish");

        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("rahul");
        al2.add("ramesh");
        System.out.println(al2);
        al2.addAll(al) ;

        System.out.println(al2);






    }
}
