package ClassesNConstructors;

public class MyClass {

    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int i;
        i = 10 ;

        MyClass ob = new MyClass();
        ob.a = 10;
        ob.d = 12.45;
        ob.c = 'g';
        ob.str = "amol";
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 11;
        ob2.d = 11.45;
        ob2.c = 'f';
        ob2.str = "rahul";
        ob2.display();

    }
}
