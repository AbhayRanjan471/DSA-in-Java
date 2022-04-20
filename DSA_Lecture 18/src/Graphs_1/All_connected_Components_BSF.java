package Graphs_1;
import java.util.*;

public class All_connected_Components_BSF {
	
	private static void AllConnectedBSFHelper(int[][] edges, int startVertx, boolean[] visited, ArrayList<Integer> ar1) {
		 Queue<Integer> queue = new LinkedList<>();
		 queue.add(startVertx);
		 visited[startVertx] = true;
		 int n = edges.length;
		 
		 while(! queue.isEmpty()) {
			 int frontVetrx = queue.poll();
			 ar1.add(frontVetrx);
			 for(int i = 0 ; i < n ; i++) {
				 if(edges[frontVetrx][i] == 1 && ! visited[i]) {
					 visited[i] = true;
					  ar1.add(i);
				 }
			 }
		 }
		
		
	}
	
	public static void connectedBSF(int[][] edges) {
		 boolean visited[] = new boolean[edges.length];
		 ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		 for(int i = 0 ; i < edges.length ; i++) {
			 if(! visited[i]) {
				 ArrayList<Integer> ar1 = new ArrayList<>();
				 AllConnectedBSFHelper(edges , i , visited ,ar1);
				 arr.add(ar1);
			 }
		 }
		   for(ArrayList<Integer> ar1 : arr){
	            Collections.sort(ar1);
	            for(int i : ar1){
	                System.out.print(i +" ");
	            }
	            System.out.println();
	        }
		
	}

	

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the no of vertex");
		 int NumOfVertex = s.nextInt();
		 System.out.println("Enter the no of Edges");
		 int NumOfEdges = s.nextInt();
		 
		 int edges[][] = new int[NumOfVertex][NumOfVertex];
		 System.out.println("Enter the first vertex and  second vertex");
		 for(int i = 0 ; i < edges.length; i++) {
			 int firstVertex = s.nextInt();
			 int secondVertex = s.nextInt();
			 
			 edges[firstVertex][secondVertex] = 1;
			 edges[secondVertex][firstVertex] = 1;
		 }
		 connectedBSF(edges);

	}

	

}
