package ExceptionHandling;

public class ThrowDemo {

    void checkNumber(int i)
    {
        if(i<=10 && i>=1)
            System.out.println("We are safe");
        else
            throw new RuntimeException("We are in a danger");
    }

    public static void main(String[] args) {

        int a = 34;

        ThrowDemo ob = new ThrowDemo();

        ob.checkNumber(a);


        System.out.println("a="+a);
        System.out.println("End of the program");
    }
}
