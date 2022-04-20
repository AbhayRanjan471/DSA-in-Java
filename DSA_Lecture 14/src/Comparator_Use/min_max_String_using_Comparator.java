package Comparator_Use;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Comparator;

class  StringLenghtComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
//		int count1 =0 ; int count2 = 0;
//		for(int i = 0 ; i < o1.length() ; i++) {
//			if(o1.charAt(i) == 'a') {
//				count1++;
//			}
//		}
		if(o1.length() < o2.length()) {
			return -1;
		}
		else if(o1.length() > o2.length()) {
			return 1;
		}
		return 0;
	}
	
}

public class min_max_String_using_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"this" , "is" , "the" , "newMe"};
		StringLenghtComparator stringComparator = new StringLenghtComparator();
		PriorityQueue<String> pq = new PriorityQueue<>(stringComparator);
		
	//	PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 0 ; i < arr.length ; i++) {
			pq.add(arr[i]);
		}
		while(! pq.isEmpty()) {
			System.out.print(pq.remove() +" ");
		}

	}

}
