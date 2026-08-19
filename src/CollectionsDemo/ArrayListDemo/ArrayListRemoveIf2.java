package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(22);
        al.add(42);
        al.add(13);
        al.add(52);
        al.add(14);
        al.add(83);



        System.out.println(al);


      //  al.removeIf(i -> i%2!=0 );
        al.removeIf(i -> i<15 );

        System.out.println(al);







    }
}
