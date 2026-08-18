package CollectionsDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        System.out.println("size="+v.size()); // 0
        System.out.println("capacity="+v.capacity()); // 10

        v.add("amol");
        v.add("swapna");
        v.add("reena");
        v.add("vishal");
        v.add("girish");
        v.add("amol");
        v.add("swapna");
        v.add("reena");
        v.add("vishal");
        v.add("girish");
        v.add("girish");
        v.add("amol");
        v.add("swapna");
        v.add("reena");
        v.add("vishal");
        v.add("girish");
        v.add("amol");
        v.add("swapna");
        v.add("reena");
        v.add("vishal");
        v.add("vishal");

        System.out.println("size="+v.size()); // 21
        System.out.println("capacity="+v.capacity()); // 40


        System.out.println(v);

        Enumeration e = v.elements();

        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
