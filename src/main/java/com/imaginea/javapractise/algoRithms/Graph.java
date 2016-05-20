/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoRithms;

/**
 *
 * @author Charanjit.Singh
 */
public class Graph {

    private final int V;
    private Bag<Integer>[] adj; //adjoint

    public Graph(int V) {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 2);
        g.addEdge(5, 4);
        g.addEdge(6, 5);
        g.addEdge(7, 6);
        g.addEdge(8, 4);
        g.addEdge(9, 3);

        for (int v = 0; v < g.V; v++) {
            for (int w : g.adj(v)) {
                System.out.println(v+" "+w);
            }
        }

    }
}
