package Stack;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }    
}


public class StackLinkedList {
	
	static Node headNode;
	
	public void push(int data) {
		Node newNode = new Node(data);
		if(headNode==null) {
			headNode=newNode;
		}else {
			newNode.next=headNode;
			headNode=newNode;
		}
	}
	public int pop() {
		int top;
		if(headNode==null) {
			System.out.println("List Is Empty");
			return 0;
		}else {
			top=headNode.data;
			headNode=headNode.next; 
			return top;
		}
	}
	public int peek() {
		if(headNode==null) {
			System.out.println("List is Empty");
			return 0;
		}else {
			return headNode.data;
		}
	}
	static void printClass() {
		Node tempNode=headNode;
		while(tempNode!=null) {
			System.out.print(tempNode.data+" >> ");
			tempNode=tempNode.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		StackLinkedList s = new StackLinkedList();
		s.push(40);
		s.push(30);
		s.push(20);
		s.push(10);
		
		printClass();
		
		System.out.println("POPING "+s.pop());
		System.out.println("After POPing");
		printClass();
		
		System.out.println("Peek at Head Node");
		System.out.println(s.peek());
		
	}
}
