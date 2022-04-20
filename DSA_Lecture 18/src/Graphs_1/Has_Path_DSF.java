//Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), check if there exists any path between 
//them or not. Print true if the path exists and false otherwise.
//Note:
//1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
//2. E is the number of edges present in graph G.
	//Sample Input 1 :
	//4 4
	//0 1
	//0 3
	//1 2
	//2 3
	//1 3
	//Sample Output 1 :
	//true

package Graphs_1;
import java.util.*;
public class Has_Path_DSF {

	 public static boolean printDSFHelper(int edges[][] , int startVertex , boolean visited[] , int v2){
	        if(startVertex==v2) return true;
	        visited[startVertex] = true;
	        int n = edges.length;
	        
	        for(int i = 0 ; i<n; ++i)
	        {
	            if(edges[startVertex][i]==1 && !visited[i])
	            {
	                if(printDSFHelper(edges,i,visited,v2))
	                    return true;
	            }
	        }
	        
	        return false;
	       
	    }

	    public static void printDSF(int edges[][] , int v1 , int v2){
	        boolean visited[] = new boolean[edges.length];
	       System.out.println(printDSFHelper(edges , v1 , visited ,v2 ));
	    }
	
	public static void main(String[] args) {
		  int NumOfVertex; // total no. of edges
	        int NumOfEdges; // total no of vertex

	        Scanner s = new Scanner(System.in);
	        //System.out.println("Enter the no of vertex");
	        NumOfVertex = s.nextInt();

	        //System.out.println("Enter the no of edges");
	        NumOfEdges = s.nextInt();

	        //now we will create a 2D array of type integer
	        int edges[][] = new int[NumOfVertex][NumOfVertex];

	        //jaha jaha v edge hai waha pe hum 1 put kre ge
	        //System.out.println("Enter the first and second vertex");
	        for(int i =0 ; i < NumOfEdges ; i++) {
	            int firstVertex = s.nextInt();
	            int secondVertex = s.nextInt();
	            //we will ask is there any edge between first and second vertex
	            edges[firstVertex][secondVertex] = 1; // if there is edge between this two vertex then we will mark it as 1
	            edges[secondVertex][firstVertex] = 1; //this has to be 1 bcz if there is an edge between 1-2 there is 
	            //already a edge between 2-1

	        }
	        int v1 = s.nextInt();
	        int v2 = s.nextInt(); 
	        printDSF(edges , v1 , v2);

	}

}
