package loops;

public class IncDec1 {

    public static void main(String[] args) {
        int i = 10;
        System.out.println(i); // 10
        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i); // 12
        System.out.println(i); // 12

        // a++ , a-- : First the statement is executed and then
        // the increment or decrement happens

        //++a , --a : First increment or decrement happens
        // then the statement is executed.
    }

}
