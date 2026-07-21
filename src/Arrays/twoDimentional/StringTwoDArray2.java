package Arrays.twoDimentional;

public class StringTwoDArray2 {

    public static void main(String[] args) {
        String[][] a = {
                {"Amit", "Sunita", "Rajesh"},
                {"Priya", "Vikram", "Anjali"},
                {"Rohan", "Kavita", "Suresh"},
                {"Neha", "Arjun", "Meera"}
        };

        int row = a.length;
        int col = a[0].length;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
