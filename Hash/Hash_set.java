package Hash;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {
	
	public static void main(String[] args) {
		//creating
		HashSet<Integer> set = new HashSet<>();
		
		//inserting
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		//size
		System.out.println("size "+set.size());
		
		//print all elements
		System.out.println(set);
		/*
		//search
		if(set.contains(1)) { //will go in if true
			System.out.println("Set contains 1");
		}
		if(!set.contains(6)) {
			System.out.println("Does not contain ");
		}
		
		//delete
		set.remove(1);
		if(!set.contains(1)) {
			System.out.println("Doest not contains 1");
		}
		*/
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
