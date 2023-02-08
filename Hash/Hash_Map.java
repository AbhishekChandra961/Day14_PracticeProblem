package Hash;
import java.util.*;
public class Hash_Map {

	public static void main(String[] args) {
		
		//country(key) , population(value)
		HashMap<String, Integer> map = new HashMap<>();
		
		//insertion
		map.put("India", 120);
		map.put("US",30);
		map.put("China", 150);
		
		System.out.println(map);
		/*
		map.put("China", 180);
		System.out.println(map);
		
		//search
		if(map.containsKey("China")) { //returns true
			System.out.println("present");
		}else {
			System.out.println("Not present");
		}
		
		System.out.println(map.get("China"));	//exist
		System.out.println(map.get("pakistan"));	//doesn't exist
		*/
		
		//iteration
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.print(e.getKey()+" ");
			System.out.print(e.getValue());
			System.out.println();
		}
		
		//remove
		map.remove("China");
		System.out.println(map);
	}
}
