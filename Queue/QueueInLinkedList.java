package Queue;



	class Node2
	{
		int data2;
		Node2 nextRef2;
		Node2(int data2)
		{
			this.data2= data2;
			nextRef2= null;
		}
	}
	public class QueueInLinkedList {
		
		static Node2 headNode= null;;
		static Node2 tail=null;

		public static void pushOrNquee(int data2)
		{

			Node2 newNode = new Node2(data2);

			if(headNode == null || tail == null)
			{
				tail = headNode= newNode;
			}
			else
			{
				tail.nextRef2= newNode;
				tail = newNode;
			}

		}
		public static int popOrDeque()
		{
			if(headNode == null)
			{
				System.out.println("List is empty");
			}
			else if(headNode== tail)
			{
				headNode=null;
				return 0;
			}
			else
			{
				int front = headNode.data2;
				headNode = headNode.nextRef2;
				return front;
			}
			return 0;
			
		

		}
		public static int peek()
		{
			if(headNode== null)
			{
				System.out.println("List is empty");
				return 0;

			}
			else
			{
				return headNode.data2;
			}

		}
		static void printClass()
		{
			Node2 tempNode = headNode;
			while(tempNode != null)
			{
				System.out.print(tempNode.data2+">>");
				tempNode = tempNode.nextRef2; // adding the next reference 
			}
			System.out.println();

		}

		
		public static void main(String[] args) {
			
			pushOrNquee(40);//first 
			//pushOrNquee(30);//second
//			pushOrNquee(20);//third
//			pushOrNquee(10);// last /fourth
//			
			printClass();
			
			popOrDeque();
			System.out.println("Popped");
			printClass();
			popOrDeque();
			
		
			
			//System.out.println();
			//peek();

			
		}

	}
