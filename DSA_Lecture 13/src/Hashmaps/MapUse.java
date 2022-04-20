package Hashmaps;

import java.util.HashMap; // header file
import java.util.Set;

public class MapUse {
	//work of inbuild Map
	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<>();
		//insert
		map.put("abc", 1); // here keys="abc" and values = 1
		map.put("def", 2);
		map.put("def1", 3);
		map.put("abc1", 1);
		map.put("abc", 1);

		//size
		System.out.println(map.size());
		
		//to check presence
		if(map.containsKey("abc"));{
			System.out.println("Has abc");
		}
		if(map.containsKey("abc1")) { // we don't have "abc1" so it will not exicute
			System.out.println("Has abc1");
		}
		
		if(map.containsValue(2)) { // key ke upar sare operation fast hote hai  ie, 0(1) , but values k upar nai 
			                    // that's why its time complexity is 0(n)
			System.out.println("has 2 as value");
		}

		//get Value
		int v = 0;
		if(map.containsKey("abc1")){
			v = map.get("abc1");
		}
		System.out.println(v);

		//remove
		int s = map.remove("abc");
		System.out.println(s);

		//iterate
		Set<String> keys = map.keySet();//we have to import it's header file also
		for(String str : keys) {
			System.out.println(str); //the order of output is not maintain
		}
	}

}
