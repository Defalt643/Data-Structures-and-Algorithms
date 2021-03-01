package Week11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BreadthFirstPaths {
	private boolean[] marked;
	private int[] edgeTo;
	private int[] distTo;

	public BreadthFirstPaths(Graph G, int s) {
		marked = new boolean[G.V()];
        distTo = new int[G.V()];
        edgeTo = new int[G.V()];
		bfs(G, s);
	}
	
	private void bfs(Graph G, int s) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(s);
		marked[s] = true;
		distTo[s] = 0;
		while (!q.isEmpty()) {
			int v = q.poll();
			for (int w : G.adj(v)) {
				if (!marked[w]) {
					q.offer(w);
					marked[w] = true;
					edgeTo[w] = v;
					distTo[w] = distTo[v] + 1;
				}
			}
		}
	}

	 public boolean hasPathTo(int v) {
	        return marked[v];
	    }
	 
	 public int distTo(int v) {
	        return distTo[v];
	    }
	
	 public Stack<Integer> pathTo(int v) {
	        if (!hasPathTo(v)) return null;
	        Stack<Integer> path = new Stack<Integer>();
	        int x;
	        for (x = v; distTo[x] != 0; x = edgeTo[x])
	            path.push(x);
	        path.push(x);
	        return path;
	    }
	
}