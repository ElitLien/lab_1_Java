package Tasks;

public class Task4 {
    public static void main(final String [] args) {
        for(int i = 0; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println("Fizz");
                continue;
            }
            if(i % 5 == 0){
                System.out.println("Buzz");
                continue;
            }
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
