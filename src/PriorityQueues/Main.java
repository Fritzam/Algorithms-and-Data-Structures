package PriorityQueues;

import java.util.*;

class Main {
    public static void main(String[] args) {

        /*Priority Queue = A FIFO data structure that serves elements
        *                  with the highest priority first, before elements
        *                  with the lower priority.*/

        Queue<String> grades = new PriorityQueue<>(Collections.reverseOrder());

        grades.offer("B");
        grades.offer("C");
        grades.offer("A");
        grades.offer("F");
        grades.offer("D");



        while(!grades.isEmpty()) {
            System.out.println(grades.poll());
        }
    }
}
