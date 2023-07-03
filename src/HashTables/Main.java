package HashTables;

import java.util.Hashtable;

class Main {

    /*Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
    *             Each key/value pair is known as an Entry
    *             FAST insertion, look up, deletion of key/value pairs
    *             Not ideal for small data sets, great with large data sets.
    *
    *Hashing = takes a key and computes an integer (formula will vary based on key & data type)
    *          In a Hashtable, we use hash % capacity to calculate an index number.
    *
    *          key.hashCode() % capacity = index
    *
    *Bucket = an indexed storage location for one or more Entries
    *         can store multiple Entries in case of collision(linked similarly as LinkedList)
    *
    *Collision = hash function generates the same index for more than one key
    *            less collisions = more efficiency.
    *
    *Runtime complexity: Best case O(1)
    *                    Worst case O(n)*/
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        table.remove(777);

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() + "\t" + key + "\t" + table.get(key));
        }

    }
}
