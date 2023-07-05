package AdjecencyMatrix;

import java.util.ArrayList;

class Graph {

    ArrayList<Node> nodes;
    int[][] matrix;
    Graph(int size) {
        matrix = new int[size][size];
        nodes = new ArrayList<>();

    }

    void addNode(Node node) {
        nodes.add(node);
    }

    void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    boolean checkEdge(int src, int dst) {

        return matrix[src][dst] == 1;
    }

    public void print() {
        System.out.print("  ");
        for (Node node: nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
