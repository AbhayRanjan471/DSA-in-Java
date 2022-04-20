//Given a chain of matrices A1, A2, A3,.....An, you have to figure out the most efficient way to multiply
//these matrices. In other words, determine where to place parentheses to minimize the number of multiplications.
//You will be given an array p[] of size n + 1. Dimension of matrix Ai is p[i - 1]*p[i]. You need to find 
//minimum number of multiplications needed to multiply the chain.
//Sample Input 1:
//3
//10 15 20 25
//Sample Output 1:
//8000

package Assignment;

public class Matrix_Chain_Mutiplication {

	public static int mcm(int[] p)
	{
		int storage[][] = new int[p.length][p.length]; 
		for(int i= p.length-2; i>= 1; i--)
		{ 
			for(int j =1; j<=p.length-1; j++)
			{ 
				if(i < j )
				{
					int minCost = Integer.MAX_VALUE; 
					for(int k = i; k < j; k++)
					{ 
						int cost = storage[i][k] + storage[k+1][j] + p[i-1]*p[k]*p[j]; 
						if(cost < minCost)
						{ 
							minCost = cost;
						} 
						storage[i][j] = minCost;
					} 
				}
			}
		}
		return storage[1][p.length-1];
	}

	public static void main(String[] args) {
		 int p[] = {10 ,15, 20,25};
		 System.out.println(mcm(p));

	}

}
