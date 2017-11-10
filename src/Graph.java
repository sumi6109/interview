import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * Created by sushantmittal on 11/10/17.
 */
class Node {
    public int value;
    public String color;

    public Node(int value, String color) {
        this.value = value;
        this.color = color;
    }
}


public class Graph {
    private int numOfVertices;

    private LinkedList<Node>[] adjList;

    public Graph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        adjList = new LinkedList[numOfVertices];
        for (int i = 0; i < numOfVertices; i++) {
            adjList[i] = new LinkedList();
        }
    }

    public void addEdge(int v, Node w) {
        adjList[v].add(w);
    }

    public void BFS(Node initial) {
        Queue statusQueue = new LinkedList();
        int[] dist = new int[numOfVertices];
        initial.color = "grey";
        dist[0] = initial.value;
        statusQueue.add(initial);
        System.out.println("initial = " + initial.value);
        int i = 0;
        while (!statusQueue.isEmpty()) {
            Node dequeuedValue = (Node) statusQueue.poll();
            LinkedList<Node> nodes = adjList[dequeuedValue.value];


            for (Node node : nodes) {
                if (Objects.equals(node.color, "white")) {
                    System.out.println("node = " + node.value);
                    statusQueue.add(node);
                    node.color = "grey";
                    i++;
                }
            }
            dequeuedValue.color = "black";
        }



    }

}
