//Given an undirected graph G(V, E) and two vertices v1 and v2(as integers), find and print the path 
//from v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
//Find the path using DFS and print the first path that you encountered
	//Sample Input 1 :
	//4 4
	//0 1
	//0 3
	//1 2
	//2 3
	//1 3
	//Sample Output 1 :
	//3 0 1

package Graphs_1;
import java.util.*;

public class Get_Path_DFS {

	public static ArrayList<Integer> printDSFHelper(int edges[][] , int startVertex , boolean visited[] , int v2 ,ArrayList<Integer> arr){

		if(startVertex >= edges.length && startVertex != v2){
			return null;
		}
		if(startVertex==v2){
			arr.add(startVertex);
			return arr;
		}
		visited[startVertex] = true;
		int n = edges.length;

		for(int i = 0 ; i<n; ++i)
		{
			if(edges[startVertex][i]==1 && !visited[i])
			{ 
				arr=printDSFHelper(edges,i,visited,v2,arr);
				if(arr.size()!=0){
					//Adding the path in the Array List
					arr.add(0 , startVertex);// at Index 0 element startVertex will be added
					// index 0 se le k age jinte v elements ho ge sab ak - ak position se  sift ho jaye ge
					// this will change the size of the array
					return arr;
				}
			}
		}
		return arr;

	}

	public static void printDSF(int edges[][] , int v1 , int v2){
		boolean visited[] = new boolean[edges.length];
		ArrayList<Integer> arr = new ArrayList<>();
		arr = printDSFHelper(edges , v1 , visited ,v2 , arr );

		for(int i = arr.size() -1 ; i >= 0 ; i--){
			System.out.print(arr.get(i) + " ");

		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the no of vertex");
		int NumOfVertex = s.nextInt();
		System.out.println("Enter the no. of edges");
		int NumOfEdges = s.nextInt();

		int edges[][] = new int[NumOfVertex][NumOfVertex];

		System.out.println("Enter the no first and second vertex");
		for(int i =0 ;i < NumOfEdges ; i++){
			int firstVertex = s.nextInt();
			int secondVertex = s.nextInt();

			edges[firstVertex][secondVertex] = 1;
			edges[secondVertex][firstVertex] = 1;
		}
		System.out.println("Enter the path from where to where we want to search");
		int v1 = s.nextInt();
		int v2 = s.nextInt();
		printDSF(edges , v1 , v2);

	}

}
