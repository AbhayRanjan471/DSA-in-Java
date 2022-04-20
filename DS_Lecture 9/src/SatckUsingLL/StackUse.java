package SatckUsingLL;

public class StackUse {

	public static void main(String[] args) {
		 StackUsingLinkedList <Integer> stack = new StackUsingLinkedList <Integer>();
		    //TO PUsh
		 for(int i =1 ; i<=5 ; i++) {
			 stack.push(i);
		 }
            //TO POP
		 while(! stack.isEmpty()) {
			 try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				//  Never reach here
				 
			}
		 }
	}

}
