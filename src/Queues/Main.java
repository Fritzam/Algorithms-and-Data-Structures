package Queues;

import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) {
        /*Queue - FIFO data structure. First-In First-Out (ex. a line of people)
        *         A collection designed for holding elements prior to processing.
        *         Linear data structure.
        *         add    = enqueue, offer()
        *         remove = dequeue, poll()*/


        //You can't instantiate queue, you need other collection to operate with the queue.
        Queue<String> line = new LinkedList<>();

        line.offer("Karen");
        line.offer("Chad");
        line.offer("Steve");
        line.offer("Harold");

        /*System.out.println(line);
        line.poll();
        System.out.println(line);
        line.poll();
        System.out.println(line);
        line.poll();
        System.out.println(line);
        line.poll();
        System.out.println(line);*/
        //Stack.element() will allow us to peek at the top of the queue.
        //Since there are no elements now, will result in exception.
        //System.out.println(line.element());

        //Will check if Queue is empty.
        System.out.println(line.isEmpty());

        //Will check the Queue's size.
        System.out.println(line.size());

        //Will check if given element exists inside the queue. Returns true, or false.
        System.out.println(line.contains("Harold"));

        //Where are queues useful?
        /*1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        * 2. Printer Queue (Print jobs should be completed in order)
        * 3. Used in LinkedLists, PriorityQueues, Breadth-first search.*/




    }
}
