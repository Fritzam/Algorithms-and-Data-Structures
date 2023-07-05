package AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

class Graph {
    ArrayList<LinkedList<Node>> alist;
    Graph() {
        alist = new ArrayList();
    }

    void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    boolean addEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        alist.get(src).add(dstNode);

        for(Node node: currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    void print() {
        for(LinkedList<Node> currentList : alist) {
            for(Node node: currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
