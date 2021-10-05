package Tasks;

public class Task5 {
    public static void main(final String[] args) {
        final int[][] mat =
                {{2, 4, 3, 4},
                        {5, 7, 5, 8},
                        {1, 1, 2, 4},
                        {8, 8, 3, 4}};

        final int m = mat.length;
        final int n = mat[0].length;

        System.out.println("First matrix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        final int[][] matT = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matT[j][i] = mat[i][j];
            }
        }

        System.out.println("Transposed matrix :");
        for (int i = 0; i < matT.length; i++) {
            for (int j = 0; j < matT[0].length; j++) {
                System.out.print(matT[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
