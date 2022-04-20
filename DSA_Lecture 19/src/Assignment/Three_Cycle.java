//Given a graph with N vertices (numbered from 0 to N-1) and M undirected edges, then count the distinct 3-cycles
//in the graph. A 3-cycle PQR is a cycle in which (P,Q), (Q,R) and (R,P) are connected by an edge.
	//Sample Input 1:
	//3 3
	//0 1
	//1 2
	//2 0
	//Sample Output 1:
	//1

package Assignment;

import java.util.Scanner;

public class Three_Cycle {
	public static int solve(boolean[][] graph, int n) {
		/*
		 * Your class should be named Solution 
		 * You may write your code here
		 */
        int count = 0 ; 
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ;  j < n ; j++){
                if(graph[i][j] == true){
                    for(int k = 0 ; k < n ; k++){
                        if(k != i && graph[j][k] == true){
                            if(graph[k][i] == true){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count/6;
	}
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enetr the size of the vertices");
		 int numVertex = s.nextInt();
		 System.out.println("Enter the size of the edges");
		 int numEdges = s.nextInt();
		 
		 boolean graph[][] = new boolean[numVertex][numVertex];
		 System.out.println("Enter the first and Second vertex");
		 for(int i = 0 ; i < numEdges ; i++) {
			 int firstVertex = s.nextInt();
			 int senondVertex = s.nextInt();
			 graph[firstVertex][senondVertex] = true;
			 graph[senondVertex][firstVertex] = true;
		 }
		 int ans = solve(graph, graph.length);
			System.out.println("Total num of cycle in the graph is : " +ans);
	}

}
