package WrapperClass;

public class Conversions {


    public static void main(String[] args) {

        String s1 = "22";
        String s2 = "33";

        System.out.println(s1+s2);

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println(i1+i2);

        String s3 = "22.11";
        String s4 = "33.22";

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);

        System.out.println(f1+f2);

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);

        System.out.println(d1+d2);

        String s5 = "FALse";

        boolean result = Boolean.parseBoolean(s5);

        if (result)
            System.out.println("result is true");
        else
            System.out.println("result is false");

        String s6 = "d";

      //  char ch = Character.parseCharacter(s6);

        char ch = s6.charAt(0);
    }
}
