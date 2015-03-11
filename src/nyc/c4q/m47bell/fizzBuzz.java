package nyc.c4q.m47bell;

/**
 * Created by c4q-marbella on 3/10/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class fizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {

                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }
    }
}


