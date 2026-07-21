package StringDemo;

public class StringSplitDemo {

    public static void main(String[] args) {

        String str = "Amol is teaching Java";

        String[] stArr = str.split(" ");

        for (int i = 0; i < stArr.length; i++) {
            System.out.println(stArr[i]);
        }
    }
}
