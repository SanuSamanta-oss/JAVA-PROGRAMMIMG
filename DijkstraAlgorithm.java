import java.util.*;

public class DijkstraAlgorithm {

    // Class to represent a graph edge/node pair
    static class Node implements Comparable<Node> {
        int vertex;
        int distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        // Compare nodes based on their distance from the source
        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    // Method to find the shortest path from a source vertex to all other vertices
    public static int[] dijkstra(List<List<Node>> adjList, int vertices, int source) {
        // Array to store the shortest distance to each vertex
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE); // Initialize all distances as infinite
        distances[source] = 0; // Distance to source itself is 0

        // Min-Heap Priority Queue to pull out the node with the minimum distance
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(source, 0));

        // Set to track finalized/visited vertices
        boolean[] visited = new boolean[vertices];

        while (!pq.isEmpty()) {
            // Extract the vertex with the minimum distance
            Node current = pq.poll();
            int u = current.vertex;

            // Skip processing if the node is already finalized
            if (visited[u]) continue;
            visited[u] = true;

            // Traverse through all adjacent neighbors of u
            for (Node neighbor : adjList.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.distance;

                // Relaxation Step: If a shorter path to v is found via u
                if (!visited[v] && distances[u] + weight < distances[v]) {
                    distances[v] = distances[u] + weight;
                    pq.add(new Node(v, distances[v]));
                }
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        int vertices = 5;
        List<List<Node>> adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        // Hardcoding a sample graph: adjList.get(source).add(new Node(destination, weight))
        adjList.get(0).add(new Node(1, 9));
        adjList.get(0).add(new Node(2, 6));
        adjList.get(0).add(new Node(3, 5));
        adjList.get(0).add(new Node(4, 3));

        adjList.get(2).add(new Node(1, 2));
        adjList.get(2).add(new Node(3, 4));

        int source = 0;
        int[] shortestDistances = dijkstra(adjList, vertices, source);

        // Print the calculated shortest distances
        System.out.println("Shortest distances from source " + source + ":");
        for (int i = 0; i < vertices; i++) {
            System.out.println("To vertex " + i + " -> " + 
                (shortestDistances[i] == Integer.MAX_VALUE ? "Unreachable" : shortestDistances[i]));
        }
    }
}
