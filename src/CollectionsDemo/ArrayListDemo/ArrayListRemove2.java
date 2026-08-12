package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemove2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(23);
        al.add(53);
        al.add(26);
        al.add(73);
        al.add(28);

        System.out.println(al);

        Integer ii = 73;

      //  al.remove("girish");
        al.remove(ii);

        System.out.println(al);







    }
}
