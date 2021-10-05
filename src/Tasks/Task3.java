package Tasks;

public class Task3 {
    public static void main(final String[] args) {
        final int[] ArrInt = new int[]{1, 2, 3, 4, 5};
        final char[] ArrChar = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};

        String res = "";

        int max = 0;

        if (ArrChar.length > ArrInt.length) {
            max = ArrChar.length;
        }
        else {
            max = ArrInt.length;
        }

        for (int i = 0; i < max; i++) {
            if (i < ArrChar.length) {
                res += String.valueOf(ArrChar[i]);
            }
            if (i < ArrInt.length) {
                res += String.valueOf(ArrInt[i]);
            }
        }
        System.out.println(res);
    }
}
