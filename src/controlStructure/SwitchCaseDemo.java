package controlStructure;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        int a ;
        int b ;
        int c;
        String operation ;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a =");
        a = sc.nextInt();

        System.out.println("enter b =");
        b = sc.nextInt();

        System.out.println("enter operation =");
        operation = sc.next();

        switch (operation)
        {
            case "add" : c = a + b;
                System.out.println("addition="+c);
                break;
            case "sub" : c = a - b;
                System.out.println("Subtraction="+c);
                break;
            case "mult" : c = a * b;
                System.out.println("Multiplication="+c);
                break;
            case "div" : c = a / b;
                System.out.println("Division="+c);
                break;
            default:
                System.out.println("Wrong operation");
                break;
        }
    }
}
