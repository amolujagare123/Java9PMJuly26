package Arrays.twoDimentional;

public class IntTwoDArray1 {

    public static void main(String[] args) {
        int[][] a = new int[4][3];

        a[0][0] = 34;
        a[0][1] = 35;
        a[0][2] = 36;

        a[1][0] = 44;
        a[1][1] = 55;
        a[1][2] = 66;

        a[2][0] = 45;
        a[2][1] = 56;
        a[2][2] = 67;

        a[3][0] = 54;
        a[3][1] = 65;
        a[3][2] = 76;

        int row = a.length;
        int col = a[0].length;


        for(int i=0;i<a.length;i++)
        {
            for (int j=0 ;j <a[0].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
