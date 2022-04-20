package Array2D;
import java.util.Scanner;
//For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column
//has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
//Note :
//If there are more than one rows/columns with maximum sum, consider the row/column that comes first.
//And if ith row and jth column has the same largest sum, consider the ith row as answer.

public class Largest_Row_OR_Column {
	public static void findLargest(int mat[][]){
		//Your code goes here
        int maxrow=Integer.MIN_VALUE;
        int maxcol=Integer.MIN_VALUE;
        int rows=mat.length;
        if(rows==0){
            System.out.println("row "+rows+" "+maxrow);
                 return;
        }
        int cols=mat[0].length;
        int point1=0;  //to store the position of row
         int point2=0;  // to store the position of column
        
        for(int i=0;i<rows;i++){
            int sumrow=0;
            for(int j=0;j<cols;j++){
                sumrow=sumrow+mat[i][j];
            }
            if(sumrow>maxrow){
                maxrow=sumrow;
                point1=i;
            }
        }
          for(int i=0;i<cols;i++){
            int sumcol=0;
            for(int j=0;j<rows;j++){
                sumcol=sumcol+mat[j][i];
            }
            if(sumcol>maxcol){
                maxcol=sumcol;
                point2=i;
            }
        }
        if(maxrow>=maxcol){
            System.out.print("row "+point1+" "+maxrow);

        }
        else{
            System.out.println("column "+point2+" "+maxcol);
        }
	}
	
	public static int[][] takingInput(Scanner s){
		System.out.println("enter the row");
		int rows=s.nextInt();
		
		System.out.println("enter the no of column");
		int cols=s.nextInt();
		
		int arr[][]=new int[rows][cols];
		System.out.println("enter the elements in array");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int arr[][]=takingInput(s);
		 findLargest(arr);
	}

}
