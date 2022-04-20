package generic_2_parameter;

	public class Pair <T , V>{  // This tells that the class is generic 
		                        // here we are using two parameter T and V
		                        // here we can declare two different data type in same object 
							    // now in place of T  and V we can use any data type in the main class access the function
							    // if we want String in place of T we will give String in main class
							    // and when we want int in place of T we will give Integer in main class
	private T first;
	private V second;
	
	public Pair(T first , V second) {
	this.first = first;
	this.second = second;
	}
	
	public T getFirst() {
	return first;
	}
	public void setFirst(T first) {
	this.first = first;
	}
	
	public V getSecond() {
	return second;
	}
	public void setSecond(V second) {
	this.second = second;
	}
	}
