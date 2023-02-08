package Queue;

import java.lang.*;
import java.util.*;

public class Queue1
{
	public static void main(String arg[])
	{
		QueueList obj = new QueueList(); // 1
		obj.enqueue(22);  //2
		obj.display();
		obj.enqueue(33);
		obj.display();
		obj.enqueue(44);
		obj.display();
		obj.enqueue(55);
		obj.display();
		obj.enqueue(66);
		obj.display();
		///////////////////////////////////////////////
		obj.dequeue();
		obj.display();
		obj.dequeue();
		obj.display();
		obj.dequeue();
		obj.display();
		obj.dequeue();
		obj.display();
		obj.dequeue();
		obj.display();
	}
}
class Node
{
	public int data;
	public Node next;
}

class QueueList
{
	public Node head;
	public int count;
	
	public QueueList()
	{
		head = null;
		count =0;
	}
	
	public void enqueue(int no)//insert last
	{
		Node newn = new Node();
		
		newn.data=no;
		newn.next=null;
		
		if(head == null)
		{
			head = newn;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newn;
		}
		count++;
	}
	public void display()
	{
		Node temp = head;
		
		System.out.println("Elements of Linked list are : ");
		while(temp!=null)
		{
			System.out.print("|"+temp.data+"|->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	public void dequeue()//delete first
	{
		if(count == 0)
		{
			return;
		}
		else if(count == 1)
		{
			head = null;
		}
		else
		{
			Node temp = head;
			head = head.next;
			temp = null;
		}
		count--;
	}
	public int countNode()
	{
		return count;
	}
	
}
