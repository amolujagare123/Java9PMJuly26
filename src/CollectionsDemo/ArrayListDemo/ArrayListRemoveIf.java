package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("swapna");
        al.add("reena");
        al.add("vishal");
        al.add("sneha");
        al.add("vishal");
        al.add("girish");

        System.out.println(al);

       // al.removeIf(str -> str.endsWith("a") );

     //   al.removeIf(str -> str.length()<=5 );


        al.removeIf(str -> str.charAt(1)=='i' );



        System.out.println(al);







    }
}
