package nyc.c4q.m47bell;

import java.util.Scanner;

/**
 * Created by c4q-marbella on 3/10/15.
 * Access Code 2-1
 * Marbella Vidals
 * program that gets an integer from the user. Count from 0 to that number.
 *
 */
public class countingMachine {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        System.out.println("Count from: ");
        int responseFrom= input.nextInt();

        System.out.println("Count to: ");
        int responseTo= input.nextInt();

        System.out.println("Count by: ");
        int responseBy= input.nextInt();

        for (int i =responseFrom;i <= responseTo; i = i + responseBy){

            System.out.print( i + " ");

        }



}





}
