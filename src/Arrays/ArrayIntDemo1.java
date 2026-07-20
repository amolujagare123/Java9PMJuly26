package Arrays;

public class ArrayIntDemo1 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 34;
        a[1] = 14;
        a[2] = 44;
        a[3] = 37;
        a[4] = 31;

        for(int i=0;i<5;i++)
          System.out.println(a[i]);

       //  for each loop
        System.out.println(" for each loop====>");
        for(int x:a)
        {
            System.out.println(x);
        }
    }
}
