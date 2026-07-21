package Arrays.singleDimentional;

public class ArrayStringDemo1 {

    public static void main(String[] args) {


        String[] a = new String[5];
        a[0] = "Hello";
        a[1] = "Welcome";
        a[2] = "to";
        a[3] = "Java";
        a[4] = "Class";

        for (int i = 0; i < 5; i++)
            System.out.println(a[i]);

        for (String x : a)
            System.out.println(x);

    }
}
