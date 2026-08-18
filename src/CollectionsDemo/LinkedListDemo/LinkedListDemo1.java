package CollectionsDemo.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("amol");
        ll.add("swapna");
        ll.add("reena");
        ll.add("vishal");
        ll.add("girish");

        System.out.println(ll);

        ll.addFirst("first");
        ll.addLast("last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

    }
}
