package Arrays.twoDimentional;

public class IntTwoDArray2 {

    public static void main(String[] args) {
        int[][] a = {
                {34,35,	36},
                {44,55,	66},
                {45,56,	67},
                {54,65,	76}
        };

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
