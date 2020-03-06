package STACK;
import java.util.*;
import static java.lang.System.exit; 

class Node { 

		int data; 
		Node next;
		Node()
		{
			next=null;
			data=0;
		}
	} 

class StackUsingLinkedlist 
{ 
	Node front; 
	StackUsingLinkedlist() 
	{ 
		this.front = null; 
	} 
	public void push(int data)
	{
			Node node=new Node();
			node.data=data;
			node.next=null;
			node.next=front;
			front=node;
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("underFLOW");
			return -1;
		}
		else
		{
			int t= front.data;
			front=front.next;
			return t;
		}
	}
	public boolean isEmpty()
	{
		if(front==null)
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	public void show()
	{
		Node x=front;
		while(x!=null)
		{
			System.out.print(x.data+" ");
			x=x.next;
		}
	}
 
	

} 

public class stack_by_ll { 
	public static void main(String[] args) 
	{ 
		StackUsingLinkedlist  obj=new StackUsingLinkedlist();
		obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 
        obj.show();
        obj.pop();
        System.out.println();
        obj.show();
		
	} 
} 
