package controlStructure;

public class TriangleType {

    public static void main(String[] args) {

        int a = 0;
        int b = 90;
        int c = 90;

        if(a+b+c==180 && a>0 && b>0 && c>0 ) {
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");

            }

            if (a == 90 || b == 90 || c == 90) {
                System.out.println("Right Angled Triangle");

            }

            if ((a == b && b != c) ||
                    (b == c && c != a) ||
                    (a == c && c != b)) {
                System.out.println("Isosceles Triangle");

            }

            if (a != b && b != c && c != a) {
                System.out.println("Scalene Triangle");
            }

        }
        else
            System.out.println("this is not a triangle");
    }
}
