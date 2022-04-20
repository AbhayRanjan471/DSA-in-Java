package generics;

public class Pair <T>{  // This tells that the class is generic 
	                   // now in place of T we can use any data type in the main  class and access the function
                       // if we want String in place of T we will give String in main class
	                   // and when we want int in place of T we will give Integer in main class
	private T first;
	private T second;
	
	public Pair(T first , T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFrist() {
		return first;
	}
	public void setFrist(T first) {
		this.first = first;
	}
	
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
}
