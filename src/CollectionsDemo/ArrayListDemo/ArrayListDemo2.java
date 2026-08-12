package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("swapna");
        al.add("reena");
        al.add("vishal");
        al.add("girish");

        System.out.println(al);

        System.out.println("using for loop =====>");
        for (int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("using for each loop =====>");

        for(String str:al)
            System.out.println(str);

        System.out.println("using Iterator =====>");

        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("using Enumeration =====>");

        Enumeration e = Collections.enumeration(al);

        while (e.hasMoreElements())
            System.out.println(e.nextElement());



    }
}
