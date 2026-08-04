package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemo {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("D:\\JAVAPR\\HelloWorld1.java");
        System.out.println("End of the program");
    }
}
