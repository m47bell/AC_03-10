package nyc.c4q.m47bell;

/**
 * Created by c4q-marbella on 3/10/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class IteratingStrings {
    public static void main(String[] args){
        String text = "hello, world";
        //int len =text.length();
        //system.out.println(len);


        for (int i= 0; i < text.length();i ++){

            char currentLetter = text.charAt(i);
            System.out.println(currentLetter);

        }


    }


}
