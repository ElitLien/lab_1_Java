package Tasks;

public class Task1 {
    public static void main(String[] args) {
        final String[] Familly = { "Mother", "Brothet", "Sister", "Father", "Grandmother", "Grandfather", "Aunt", "Uncle" };

        final int size = Familly.length;

        for(int i = 0; i < size - 1; i++)
            for(int j = 0; j < size - i - 1; j++)
                if (Familly[j].length() > Familly[j + 1].length()) {
                    String a = Familly[j];
                    Familly[j] = Familly[j + 1];
                    Familly[j + 1] = a;
                }
        for(int i = 0; i < size; i++)
            System.out.println(Familly[i]);
    }
}

