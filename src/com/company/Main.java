//Ben Woolf  --  0583926

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);                         //Utilizes a scanner, allows input
        int indexCount = 0;                                             //Sets index count to 0
        int index;


        System.out.println("\nWelcome! Enter a negative number at any time to exit the program.");


            do {
                Timer time = new Timer();
                System.out.println("\nStart time in nanoseconds: " + time.startTime);
                System.out.println("\nUp until which index would you like to calculate a fibonacci term?");
                index = input.nextInt();


                Calculate fibCalc = new Calculate();                    //Calls the method that calculates the next term
                                                                        //based on the last two terms

                long value;
                int i = 0;
                while (i <= index) {

                    value = fibCalc.fibonacci(i);
                    System.out.println(value);

                    i++;
                }

                Timer finalTime = new Timer();
                System.out.println("Time in nanoseconds: " + finalTime.elapsedTime);

                indexCount++;                                           //Adds to the index count, exits loop once count
            } while (indexCount <= 4 && index >= 0);                    //reaches 5

    }



    public static class Calculate {

        //fibonacci calculates the fibonacci number at the given index
        public long fibonacci(int i) {

                if (i == 0) return 0;                                   //Special case
                if (i <= 2) return 1;                                   //Special cases

                long fibTerm = fibonacci(i - 1) + fibonacci(i - 2);
                    return fibTerm;                                     //Calculates and returns the fibonacci term

        }
    }

    public static class Timer {

        public long startTime = System.nanoTime();
        public long elapsedTime = System.nanoTime() - startTime;        //Calculates elapsed time by subtracting start
                                                                        //time from current time
    }
}