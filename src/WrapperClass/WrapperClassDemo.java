package WrapperClass;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int i = 5;

      //  Integer ii = new Integer(5);

        Integer ii = 5;

        System.out.println("i="+i);
        System.out.println("ii="+ii);

        int x = ii.intValue();

        System.out.println("x="+x);

        int y = ii;
        System.out.println("y="+y);

    }
}
