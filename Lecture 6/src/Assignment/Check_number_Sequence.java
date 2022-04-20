package Assignment;

import java.util.Scanner;

public class Check_number_Sequence {

	public static void main(String[] args) {
		
//		You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.
//				Note : We say that x is strictly larger than y when x > y.
//				So, a strictly increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly increasing sequence.
//
//
//				That is, in the sequence if numbers are decreasing, they can start increasing at one point. And once the sequence of numbers starts increasing, they cannot decrease at any point further.
//				Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So, in both the cases, print true.
//
//
//				You just need to print true/false. No need to split the sequence.
//				Input format :
//				Line 1 : Integer 'n'
//				Line 2 and Onwards : 'n' integers on 'n' lines(single integer on each line
//		Sample Input 1 :
//			5
//			9
//			8
//			4
//			5
//			6
//			Sample Output 1 :
//			true
		
		 Scanner sc = new Scanner(System.in);
	        boolean isDec = true;
	        boolean isValid = true;
	        int n = sc.nextInt();
	        int p = sc.nextInt();    //'p' store previous no.
	        int i = 1;

	        while(i < n) {             // correct way
	            int c = sc.nextInt();   //'c' store current no.
	            
	            if(c < p) {
	                if(isDec == false) {
	                    isValid = false;  //solved by TA
	                    break;
	                }
	            }
	            else if (c == p) {
	                isValid = false;
	                break;
	            }
	            else if(c > p){
	                isDec = false;
	            }
	        	
	            p = c;
	            i++;
	        }
	        System.out.println(isValid); 
	        
	        // Alternate Method (from  coding ninja solution)
	        
//	        Scanner sc = new Scanner(System.in);
//	        boolean isDec = true;
//	        boolean isValid = true;
//	        int n = sc.nextInt();
//	        int p = sc.nextInt();
//	        int i = 1;
//
//	        while(i < n) {
//	            int c = sc.nextInt();
//	            
//	            if(c < p) {
//	                if(isDec == false) {
//	                    isValid = false;
//	                    break;
//	                }
//	            }
//	            else if (c == p) {
//	                isValid = false;
//	                break;
//	            }
//	            else if(c > p){
//	                isDec = false;
//	            }
//	        	
//	            p = c;
//	            i++;
//	        }
//	        System.out.println(isValid);
	        
	        
	        // done one is wrong
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		int previous=s.nextInt();
//		
//		 while((n-1)!=0)                      //  wrong
//		{
//			int current=s.nextInt();
//			
//			if(previous==current) {
//				System.out.println("false");
//				break;
//			}
//			else if(current<previous) 
//			{
//				previous=current;
//			}
//			else if (previous>current)
//			{
//				previous=current;
//				
//				if(current<previous)
//				{
//					System.out.println("false");
//					break;
//				}
//			}
//			n--;
//			 
//			
//		}
//		
//        System.out.println("true");
	}

}
