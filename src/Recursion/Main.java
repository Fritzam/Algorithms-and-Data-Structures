package Recursion;

import java.sql.SQLOutput;

class Main {
    /*Recursion =  When a thing is defined in terms of itself. - Wikipedia
     *             Apply the result of a procedure, to a procedure.
     *             A recursive method calls itself. Can be a substitute for iteration.
     *             Divide a problem into sub-problems of the same type as original.
     *             Commonly used with advanced sorting algorithms and navigating trees.
     *
     *             Advantages:
     *             ----------
     *             Easier to read/write.
     *             Easier to debug.
     *
     *             Disadvantages:
     *             ----------
     *             Sometimes slower.
     *             Uses more memory.
     * */


    public static void main(String[] args) {

     /*   //Iterative way:
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Iterative sum is: " + sum);

        //Recursive way:
        sum = Sum(5);
        System.out.println("Recursive sum is: " + sum);
    }
      */
        System.out.println(factorial(12));
        System.out.println(power(2, 8));
    }


    private static int Sum(int n) {
        if (n < 1) return 0;
        return n + Sum(n - 1);
    }

    private static int factorial(int n) {
        if(n < 2) return 1;
        return n * factorial(n - 1);
    }

    private static int power(int b, int e) {
        if (e < 1) return 1;
        return b * power(b, e - 1);
    }
}
