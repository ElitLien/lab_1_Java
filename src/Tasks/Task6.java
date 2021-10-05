package Tasks;

public class Task6 {
    public static void main(String[] args){
        final int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        final int b[][] = {{1, 1, 1}, {2, 2, 2}};

        final int c[][] = new int[3][2];

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            System.out.print(c[i][j] + " ");
            }
        System.out.println();
        }
    }
}
