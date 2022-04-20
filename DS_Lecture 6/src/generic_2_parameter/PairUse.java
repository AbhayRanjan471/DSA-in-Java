package generic_2_parameter;

public class PairUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pair<String , String> p = new Pair<String ,String>("abhay" , "avi"); // two same parameter
		p.setFirst("abhi");
		String s = p.getFirst();
		System.out.println(s);
		
		Pair<Integer , String> p1 = new Pair< Integer ,String>(12,"Siri"); // two different parameter
		p1.setFirst(10);
		p1.setSecond("code");
		System.out.println(p1.getSecond());
		System.out.println(p1.getFirst());
		
		Pair<Character , Character> p2 = new Pair<>('a' , 'c');
		
		//Pair k andar PAir
		int a=10;
		int b= 12;
		int c= 20;
		
		Pair<Integer , Integer> internalPair = new Pair<>(a , b);
		
		Pair<Pair<Integer ,Integer> ,Integer> p3 = new Pair<>(internalPair , c);
		
		System.out.println(p3.getSecond()); 
		System.out.println(p3.getFirst().getFirst()); // pair uthega -> pair ka pahla 
		System.out.println(p3.getFirst().getSecond());// pair uthega -. pair ka dushra
	}

}
