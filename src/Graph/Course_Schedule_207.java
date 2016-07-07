package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Course_Schedule_207 {
	
	public class Solution {
		@SuppressWarnings("unused")
		private boolean Kahn_AdjacencyMatrix(int numVertices, int[][] edges) {
			boolean[][] adjacencyMatrix = new boolean[numVertices][numVertices];
			int restEdges = 0;
			// 0 degree vertex
			int[] inDegree = new int[numVertices];
			for (int i = 0; i < edges.length; ++ i) {
				if (!adjacencyMatrix[edges[i][1]][edges[i][0]]) {
					++ restEdges; ++ inDegree[edges[i][0]];
					adjacencyMatrix[edges[i][1]][edges[i][0]] = true;
				}
			}
			LinkedList<Integer> vertices = new LinkedList<>();
			for (int i = 0; i < inDegree.length; ++ i) {
				if (0 == inDegree[i]) { vertices.add(i); }
			}
			while (!vertices.isEmpty()) {
				LinkedList<Integer> newAdded = new LinkedList<>();
				while (!vertices.isEmpty()) {
					int vertex = vertices.poll();
					for (int pointed = 0; pointed < numVertices; ++ pointed) {
						if (adjacencyMatrix[vertex][pointed]) {
							adjacencyMatrix[vertex][pointed] = false;
							-- restEdges; -- inDegree[pointed];
							if (0 == inDegree[pointed]) {
								newAdded.add(pointed);
							}
						}
					}
				}
				vertices.addAll(newAdded);
			}
			return 0 == restEdges;
		}
		private boolean Kahn_AdjacencyList(int numVertices, int[][] edges) {
			ArrayList<HashSet<Integer>> adjacencyList = 
					new ArrayList<>(numVertices);
			for (int i = 0; i < numVertices; ++ i) { adjacencyList.add(new HashSet<>()); }
			int restEdges = 0;
			// 0 degree vertex
			int[] inDegree = new int[numVertices];
			for (int i = 0; i < edges.length; ++ i) {
				if (!adjacencyList.get(edges[i][1]).contains(edges[i][0])) {
					++ restEdges; ++ inDegree[edges[i][0]];
					adjacencyList.get(edges[i][1]).add(edges[i][0]);
				}
			}
			LinkedList<Integer> vertices = new LinkedList<>();
			for (int i = 0; i < inDegree.length; ++ i) {
				if (0 == inDegree[i]) { vertices.add(i); }
			}
			while (!vertices.isEmpty()) {
				LinkedList<Integer> newAdded = new LinkedList<>();
				while (!vertices.isEmpty()) {
					int vertex = vertices.poll();
					for (int pointed : adjacencyList.get(vertex)) {
						-- restEdges; -- inDegree[pointed];
						if (0 == inDegree[pointed]) {
							newAdded.add(pointed);
						}
					}
				}
				vertices.addAll(newAdded);
			}
			return 0 == restEdges;
		}
	    public boolean canFinish(int numCourses, int[][] prerequisites) {
//	        return Kahn_AdjacencyMatrix(numCourses, prerequisites);
	    	return Kahn_AdjacencyList(numCourses, prerequisites);
	    }
	}

	public static void main(String[] args) {
		new Course_Schedule_207().new Solution().canFinish(10, 
				new int[][]{{5,8},{3,5},{1,9},{4,5},{0,2},{1,9},{7,8},{4,9}});
	}

}
