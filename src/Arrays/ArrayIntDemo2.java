package Arrays;

public class ArrayIntDemo2 {

    public static void main(String[] args) {

        int[] a = {12,45,7,88,78,89};

        for(int i=0;i<a.length;i++)
          System.out.println(a[i]);
       //  for each loop
        System.out.println(" for each loop====>");
        for(int x:a)
        {
            System.out.println(x);
        }
    }
}
