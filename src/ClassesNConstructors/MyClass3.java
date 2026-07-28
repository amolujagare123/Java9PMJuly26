package ClassesNConstructors;

public class MyClass3 {

    int a;
    double d;
    char c;
    String str;

    // parameterized Constructor
   /* MyClass3(int a1,double d1,char c1,String str1)
    {
        a = a1;
        d = d1;
        c = c1;
        str = str1;
    }*/

    // parameterized Constructor with this operator
    MyClass3(int a,double d,char c,String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass3 ob = new MyClass3(23,4.5, 'h',"java");
        ob.display();
    }
}
