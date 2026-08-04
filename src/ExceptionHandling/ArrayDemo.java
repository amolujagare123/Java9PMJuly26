package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = new int[5];
        try {
        a[0] = 34;
        a[1] = 14;
        a[2] = 44;
        a[3] = 37;
        a[4] = 31;
        a[5] = 31;
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        for(int i=0;i<5;i++)
            System.out.println(a[i]);


        System.out.println("End of the program");
    }
}
