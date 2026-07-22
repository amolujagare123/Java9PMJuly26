package StringDemo;

public class StringSplitDemo2 {

    public static void main(String[] args) {

        String str = "Selenium is powerful::Java is popular::Testing is essential";

        String[] stArr = str.split("::");

        for (int i = 0; i < stArr.length; i++) {
            System.out.println(stArr[i]);
        }
    }
}
