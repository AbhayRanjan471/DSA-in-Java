package Strings;

public class CountWord {
	public static void print(String str) {
		int c=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				 
				c++;
				 
			}
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
	String str	 ="adcd efg hij";
			print(str);
		
		 
	}

}
