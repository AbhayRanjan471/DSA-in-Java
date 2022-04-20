package generics;

public class PairUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Pair<String> p = new Pair<String>("abc" , "cd"); //now here we have given String in place of T
		 p.setFrist("avi");
		 String s = p.getFrist();
		 System.out.println(s);
		 
		 Pair<Integer> p1 = new Pair<Integer>(1,2);
		 p1.setFrist(5);
		 int n = p1.getFrist();
		 System.out.println(n);
		 
		 Pair<Character> p2 = new Pair<>('a' ,'b');
		 p2.setFrist('c');
		 char ch = p2.getFrist();
		 System.out.println(ch);
	}

}
