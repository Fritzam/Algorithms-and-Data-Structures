package LinkedLists;

import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        /*LinkedList = stores Nodes in 2 parts(Data + address)
        *              Nodes are in non-consecutive memory locations
        *              Elements are linked using pointers.
        *
        *                          Singly Linked List
        *             Node                Node                Node
        *        [data | address] -> [data | address] -> [data | address]
        *
                                   Doubly Linked List
        *                   Node                           Node
        *        [address | data | address] <-> [address | data | address]
        *
        *              Advantages?:
        *              1. Dynamic Data Structure (allocates needed memory while running).
        *              2. Insertion and Deletion of Nodes is easy. O(1).
        *              3. No/Low memory waste.
        *
        *              Disadvantages?:
        *              1. Greater memory usage (additional pointer)
        *              2. No random access of elements (no index [i]).
        *              3. Accessing/searching elements is more time-consuming. O(n)
        *
        *              Uses?:
        *              1. Implement Stacks/Queues.
        *              2. GPS navigation.
        *              3. Music playlist.
        * */

        LinkedList<String> linkedList = new LinkedList<>();

        //Adding elemenets to linkedList
        /*linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");*/

        //You can also use queue/stack methods to do the same.
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        //To put at the certain "place" in list you can do this:
        linkedList.add(4, "E");
        System.out.println(linkedList);
        //And to remove just use remove() with the element.
        linkedList.remove("E");
        System.out.println(linkedList);

        //This will allow you to peek at the first and last element of linkedList
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");
        System.out.println(linkedList);

    }
}
