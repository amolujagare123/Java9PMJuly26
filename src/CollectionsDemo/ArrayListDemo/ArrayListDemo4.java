package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

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
        al2.add("reena");
        al2.add("girish");
        al2.add("amol");




        System.out.println(al2);
        al2.removeAll(al) ;

        System.out.println(al2);






    }
}
