//It's Gary's birthday today and he has ordered his favourite square cake consisting of '0's and '1's . 
//But Gary wants the biggest piece of '1's and no '0's . A piece of cake is defined as a part which consist 
//of only '1's, and all '1's share an edge with each other on the cake. Given the size of cake N and the cake,
//can you find the count of '1's in the biggest piece of '1's for Gary ?
	//Sample Input 1:
	//2
	//1 1
	//0 1
	//Sample Output 1:
	//3

package Assignment;

import java.util.Scanner;

public class Largest_Piece {

	public static int largePeice(String[] edge, int i, int j,int n, boolean[][] visited){
		if(i<0 || i==n || j<0 || j==n){
			return 0;
		}
		if(visited[i][j] || edge[i].charAt(j)!='1'){
			return 0;
		}
		visited[i][j] = true;
		//traversing in all the four direction
		int ans1 = largePeice(edge, i+1, j, n, visited);
		int ans2 = largePeice(edge, i-1, j, n, visited);
		int ans3 = largePeice(edge, i, j+1, n, visited);
		int ans4 = largePeice(edge, i, j-1, n, visited);

		return ans1 + ans2 + ans3 + ans4 + 1;
	}

	public static int SquareCake(String[] edge, int n) {

		boolean[][] visited = new boolean[n][n];
		int res = Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(!visited[i][j] && edge[i].charAt(j)=='1'){
					res = Math.max(res, largePeice(edge, i, j, n, visited));
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of square cake N*N");
		int n = s.nextInt();
		String edge[] = new String[n];
		System.out.println("Enter  square cake consisting of '0's and '1's ");
		for(int i = 0 ; i < n ; i++) {
			edge[i] = s.next();
		}
		int LargPeice = SquareCake(edge, n);
		System.out.println("Largest peice of cake is : " + LargPeice);

	}

}
