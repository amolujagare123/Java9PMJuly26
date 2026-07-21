package Arrays.twoDimentional;

public class StringTwoDArray1 {

    public static void main(String[] args) {
        String[][] a = new String[4][3];

        a[0][0] = "Amit";
        a[0][1] = "Sunita";
        a[0][2] = "Rajesh";

        a[1][0] = "Priya";
        a[1][1] = "Vikram";
        a[1][2] = "Anjali";

        a[2][0] = "Rohan";
        a[2][1] = "Kavita";
        a[2][2] = "Suresh";

        a[3][0] = "Neha";
        a[3][1] = "Arjun";
        a[3][2] = "Meera";

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
