package StaticNFinal;

public class Student2 {

    public int rno;
    public String name;
    public static String college = "ITS";

    public void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static  void staticMethod1()
    {
        System.out.println("staticMethod1");
    //    System.out.println("rno="+rno); // non-static - not allowed
   //     System.out.println("name="+name); // non-static - not allowed
        System.out.println("college="+college);//  static - not allowed
        staticMethod2();//  static -  allowed
   //     display();// non-static - not allowed
    //    nonstaticMethod();// non-static - not allowed
    }

    public static  void staticMethod2()
    {
        System.out.println("staticMethod2");
    }

    public void nonstaticMethod()
    {
        System.out.println("nonstaticMethod");
        System.out.println("rno="+rno); // non-static -  allowed
        System.out.println("name="+name); // non-static -  allowed
        System.out.println("college="+college);//  static -  allowed
        staticMethod2();//  static -  allowed
        display();// non-static -  allowed
        nonstaticMethod();// non-static -  allowed
    }

    public static void main(String[] args) {

        Student2 s1 = new Student2();

        s1.staticMethod1();
        Student2.staticMethod1();
        Student2.staticMethod2();

    }
}
