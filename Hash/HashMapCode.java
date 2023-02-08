package Hash;

import java.util.*;

public class HashMapCode {

	static class HashMap<K,V>{	//generic key=K,value=V
		private class Node{
			K key;
			V value;
			
			public Node(K key, V value) {	//constructor
				this.key = key;
				this.value = value;
			}
		}
		
		private int n;	//no. of nodes
		private int N;	//no. of buckets
		//HashMap creation
		private LinkedList<Node> buckets[];	//buckets is a array of data type -> LinkedList<Node>
		
		public HashMap() { //constructor of HashMap class => line 7
			this.N = 4;
			this.buckets = new LinkedList[4];	//initilizing the array buckets
			for(int i=0; i<4; i++) {
				this.buckets[i] = new LinkedList<>();	//creating a linkedlist at every index
			}
		}
		
		private int hashFunction(K key) {	//blackbox=> returns Bucket Index according to the key value
			int bi = key.hashCode();	//hashCode inbuild function will return any number(+.-)
			return Math.abs(bi) % N;	//index should be b/w 0 to N-1
		}
		
		private int searchInLL(K key, int bi) {		//Search in Linked List
			LinkedList<Node> ll = buckets[bi];
			int di = 0;
			for(int i=0; i<ll.size(); i++) {
				if(ll.get(i).key == key) {
					return i;	//di
				}
			}
			return -1;
		}
		
		private void rehash() {
			LinkedList<Node> oldBucket[] = buckets;		//storing Buckets array in oldBuckets
			buckets = new LinkedList[N*2];		//Increasing the size of buckets array from N to N*2
			
			for(int i=0; i<N*2; i++) {		//created empty linkedlist
				buckets[i] = new LinkedList<>();
			}
			
			for(int i=0; i<oldBucket.length; i++) {		//created empty bucket
				LinkedList<Node> ll = oldBucket[i];
				for(int j=0; j<ll.size(); j++) {
					Node node = ll.get(j);
					put(node.key, node.value);		//call put function => line 64
				}
			}
		}
		
		public void put(K key, V value) {
			
			int bi = hashFunction(key);	//bi=>bucketIndex
			int di = searchInLL(key, bi);	//di=>dataIndex
			
			if(di == -1) {	//if its -1 then that key doesn't exist in LL
				buckets[bi].add(new Node(key, value));
				n++;	//key is added at means No of node is increased
			}else {	//key exist
				Node node = buckets[bi].get(di);
				node.value = value;
			}
			
			double lambda = (double)n/N;
			if(lambda > 2.0) {
				rehash();
			}
		}
		//getting the value
		public V get(K key) {
			int bi = hashFunction(key);	//bi=>bucketIndex
			int di = searchInLL(key, bi);	//di=>dataIndex
			
			if(di == -1) {	//if its -1 then that key doesn't exist in LL
				return null;
			}else {	//key exist
				Node node = buckets[bi].get(di);
				return node.value;
			}
			
		}
		//finding=> contains
		public boolean conatainsKey(K key) {
			int bi = hashFunction(key);	//bi=>bucketIndex
			int di = searchInLL(key, bi);	//di=>dataIndex
			
			if(di == -1) {	//if its -1 then that key doesn't exist in LL
				return false;
			}else {	//key exist
				return true;
			}
		}
		
		//remove
		public V remove(K key) {
			int bi = hashFunction(key);	//bi=>bucketIndex
			int di = searchInLL(key, bi);	//di=>dataIndex
			
			if(di == -1) {	//if its -1 then that key doesn't exist in LL
				return null;
			}else {	//key exist
				Node node = buckets[bi].remove(di);
				n--;
				return node.value;
			}
		}
		
		public boolean isEmpty() {
			return n==0;
		}
		
		public ArrayList<K> keySet(){		//put all keys in the arraylist
			ArrayList<K> keys = new ArrayList<>();
			
			for(int i=0; i<buckets.length; i++) {
				LinkedList<Node> ll = buckets[i];
				for(int j=0; j<ll.size(); j++) {
					Node node = ll.get(j);
					keys.add(node.key);
				}
			}
			return keys;
		}
		
		public static void main(String[] args) {
			HashMap<String, Integer> map = new HashMap<>();		//object of HashMap class => line 5
			map.put("India", 190);
			map.put("China", 200);
			map.put("US", 50);
			
			ArrayList<String> keys = map.keySet();
			for(int i=0; i<keys.size(); i++) {
				System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
			}
			
			//map.remove("India");
			//System.out.println(map.get("India"));
		}
		
	}
}
