package Tasks;

public class Task2 {
    public static void main(String[] args) {
        final String[] Familly = {"Mother", "Brothet", "Sister", "Father", "Grandmother", "Grandfather", "Aunt", "Uncle" };

        int word = 0;

        for (int i = 0; i < Familly.length; i++) {
            for (int j = 0; j < Familly[i].length(); j++) {
                final char temp;
                temp = Familly[i].charAt(j);

                if (temp == 'a')
                    word++;
            }
        }
        System.out.println("a appears " + word + " times in Familly");
    }
}
