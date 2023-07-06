package DepthFirstSearch;

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

    void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix.length];
        dfsHelper(src, visited);
    }
    private void dfsHelper(int src, boolean[] visited) {
        if (visited[src]) {
            return;
        } else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }

        for (int i = 0; i < matrix[src].length; i++) {
            if (matrix[src][i] == 1) {
                dfsHelper(i, visited);
            }
        }
    }
}
