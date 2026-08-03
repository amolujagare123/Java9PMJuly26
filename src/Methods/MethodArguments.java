package Methods;

public class MethodArguments {

    void myMethod()
    {
        System.out.println("myMethod");
    }

    void myMethod2(int a)
    {
        System.out.println("a="+a);
    }

    void myMethod3(int a,int b)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    void myMethod4(int a,double b)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    void myMethod5(int a,String b)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    void addAllNumbers(int[] a)
    {
        int sum = 0;
        for (int i:a)
            sum = sum + i;

        System.out.println("all values addition="+sum);
    }

    void printMyStrings(String[][] stArr)
    {
        for(int i=0;i< stArr.length ; i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }

   /* void reverseAllStrings(String[][] stArr)
    {

    }*/

    public static void main(String[] args) {

        MethodArguments ob = new MethodArguments();
        ob.myMethod();
        ob.myMethod2(12);
        ob.myMethod3(12,56);
        ob.myMethod4(12,23.45);
        ob.myMethod5(12,"amol");

        int[] arr = {12,34,56,78,90,11,22,33};

        ob.addAllNumbers(arr);

        String[][] names = {
                {"Amit", "Sunita", "Rajesh"},
                {"Priya", "Vikram", "Anjali"},
                {"Rohan", "Kavita", "Suresh"},
                {"Neha", "Arjun", "Meera"}
        };

        ob.printMyStrings(names);

    }
}
