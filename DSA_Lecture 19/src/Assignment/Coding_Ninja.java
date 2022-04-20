//Given a NxM matrix containing Uppercase English Alphabets only. Your task is to tell if there is a path in
//the given matrix which makes the sentence “CODINGNINJA” .
//There is a path from any cell to all its neighbouring cells. For a particular cell, neighbouring cells are
//those cells that share an edge or a corner with the cell
	//Sample Input 1:
	//2 11
	//CXDXNXNXNXA
	//XOXIXGXIXJX
	//Sample Output 1:
	//1

package Assignment;

public class Coding_Ninja {
	
	public static boolean findPath(String[] graph,int i,int j,String pathSoFar,boolean[][] visited)
    {
        //This condition check that the index i and j doesn't goes out of bound
        if(i>=graph.length||i<0||j>=graph[0].length()||j<0){
            return false;
    }
        if(visited[i][j]){ // the index is already visited then it will return false 
            return false;
        }
        int len = pathSoFar.length();
        pathSoFar = pathSoFar + graph[i].charAt(j); //adding the present index character
        String dest = "CODINGNINJA";
        
        if(pathSoFar.equals("CODINGNINJA")){// comparing to check did we get the string for which we are searching
            return true;                    
        }
        if(!pathSoFar.equals(dest.substring(0,len+1))){ //the string which we have stored in pathSoFar till now if it doesn't 
            return false;                         //matches with given dest String till the length of pathSoFar we will return false
        }
        visited[i][j] = true; // marking the index as traveled
        
        //Traversing in all the 8 direction
        
        if(findPath(graph,i,j+1,pathSoFar,visited)) return true;
        if(findPath(graph,i,j-1,pathSoFar,visited)) return true;
        if(findPath(graph,i+1,j,pathSoFar,visited)) return true;
        if(findPath(graph,i-1,j,pathSoFar,visited)) return true;
        
        if(findPath(graph,i+1,j+1,pathSoFar,visited)) return true;
        if(findPath(graph,i-1,j-1,pathSoFar,visited)) return true;
        if(findPath(graph,i-1,j+1,pathSoFar,visited)) return true;
        if(findPath(graph,i+1,j-1,pathSoFar,visited)) return true;
        
        visited[i][j] = false; //when we have traveled in the particular direction and we didn't got the required string which 
        // we are searching then while returning back we will unmark the already visited index
        return false;
        
    }
    
	public static int solve(String[] Graph , int N, int M)
	{
		 
        boolean[][] visited = new boolean[N][M]; // created a visited array to mark the index we have visited
        
        for(int i = 0;i<N;++i)
        {
            for(int j = 0;j<M;++j)
            {
                if(Graph[i].charAt(j)=='C')
                {
                	//travel in all the 8 direction
                    visited[i][j] = true;
                    if(findPath(Graph,i,j+1,"C",visited)) return 1;
                    if(findPath(Graph,i+1,j,"C",visited)) return 1;
                    if(findPath(Graph,i,j-1,"C",visited)) return 1;
                    if(findPath(Graph,i-1,j,"C",visited)) return 1;
                    
                    if(findPath(Graph,i+1,j+1,"C",visited)) return 1;
                    if(findPath(Graph,i-1,j-1,"C",visited)) return 1;
                    if(findPath(Graph,i-1,j+1,"C",visited)) return 1;
                    if(findPath(Graph,i+1,j-1,"C",visited)) return 1;
                    
                    visited[i][j] = false;
                }
            }
        }
        
        return 0;
	}
	
	public static void main(String[] args) {
		 String graph[] = {"CXDXNXNXNXA" , "XOXIXGXIXJX"};
		 String str = "CODINGNINJA";
		 System.out.println(solve(graph , 2 , 11));
	}                                   //N //M
	

}
