package Array_List;

import java.util.ArrayList; // we have to import this header file

public class Array_list_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//capacity :-maximum kitne elements dal skte hai array me
		//Size :- av kitne elements user ne dale hai
		
		ArrayList<Integer> list1 = new ArrayList<>();// by doing this its keep a fixed capacity array (by default its capacity is 10)
		System.out.println(list1.size()); // this tells av kitne elements array me hai
		
		//to add elements in array list
		list1.add(15); // this is the way to add elements in array
		list1.add(20);
		list1.add(25);
		System.out.println(list1.size());
		
		//to read elements at particular Index
		System.out.println(list1.get(2));// to read elements
		
		//another way to add elements in array list
		list1.add(2 ,50); // at Index 2 element 50 will be added
		                 // index 2 se le k age jinte v elements ho ge sab ak - ak position se  sift ho jaye ge
		                // this will change the size of the array
		System.out.println(list1.get(2));// now it will show output 50 bcz we have added 50 at index 2
		
		// if we want to print all the elements in array list
		for(int i=0 ; i< list1.size() ; i++) {
			System.out.print(list1.get(i) +" ");// we have to use" list1.get(i)" to fetch what is present at ith Index of array list
		}
		System.out.println();
		
			// if we want to remove elements from particular Index
			list1.remove(1); // here we have deleted the element that is present at INdex 1.
		for(int i=0 ; i< list1.size() ; i++) {
			System.out.print(list1.get(i) +" ");
		}
		System.out.println();
		
		
		// if we want to set element at particular Index
		// set will not change the size ,ye bas us index pe ja k value overwrite krta hai
		list1.set(1 , 60);
		for(int i=0 ; i< list1.size(); i++) {
			System.out.print(list1.get(i) +" ");
		}
		System.out.println();
		
		//another variation of for loop ie, for each loop
		// ye direct elements pe move krta hai rather then Index
		for( int elem : list1) { //way to read it :- for each integer elem in list1
			System.out.print(elem +" ");
		}
	}

}
