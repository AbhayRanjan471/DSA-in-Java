package Assignment;
//Given an array A of size n and an integer K, return all subsets of A which sum to K.
//Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
//Note : The order of subsets are not important.
//Input format :
//Sample Input :
//9 
//5 12 3 17 1 18 15 3 17 
//6
//Sample Output :
//3 3
//5 1

public class Return_Subsets_Sum_to_K {
	
	public static int[][] subsetsSumK(int input[], int k) {
		
		  int[][] ans= subsetsSumK(input,0,k);
	        return ans;
	        
		}
	    public static int[][]  subsetsSumK(int input[],int startindex,int sum)  //sum ==k
	    {
	        //base case
	        if(startindex==input.length)
	        {
	            if(sum==0)
	            {
	                //matlab kuch to mila hi hog
	                return new int[1][0];
	            }
	            else
	            {
	                return new int[0][0];
	            }
	        }
	        int smallans1[][]= subsetsSumK(input,startindex+1,sum-input[startindex]);//include hoga
	        int smallans2[][]= subsetsSumK(input,startindex+1,sum);
	        int ans[][]=new int[smallans1.length+smallans2.length][];
	        int k=0;//jo mera answer ko point kar rha hai
	        for(int i=0;i<smallans1.length;i++)
	        {
	            ans[k]=new int[smallans1[i].length+1];
	            
	            ans[k][0]=input[startindex];//pehla elementdaal
	            for(int j=0;j<smallans1[i].length;j++)
	            {
	                ans[k][j+1]=smallans1[i][j];
	            }
	            k++;
	        }
	        for(int i=0;i<smallans2.length;i++)
	        {
	            ans[k]=new int[smallans2[i].length];
	            //pehla element daal na nahi hai
	            for(int j=0;j<smallans2[i].length;j++)
	            {
	                ans[k][j]=smallans2[i][j];
	            }
	            k++;
	        }
	        return ans;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = {5,12,3,17,1,18,15,3,17};
		int ans[][] =subsetsSumK(input , 6);
		
		for(int i=0 ; i< ans.length ;i++) {
			for(int j=0 ; j < ans[0].length ; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
