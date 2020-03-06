package queeue;
import java.util.*;

class Node
{
	int data;
	Node next;
	Node()
	{
		next=null;
		data=0;
	}
}
class Queuee
{
	Node head;
	Node last;
	public void enqueue(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
			last=node;
		}
		else
		{
			Node x=head;
			while(x.next!=null)
			{
				x=x.next;
			}
			x.next=node;
			last=node;
		}
	}
	public int deQueue()
	{
		if(head==null)
		{
			return -1;
		}
		else
		{
			int d=head.data;
			head=head.next;
			return d;
		}

	}
	public void show()
	{
		Node x=head;
		while(x!=null)
		{
			System.out.print(x.data+" ");
			x=x.next;
		}
	}
}

public class queue_linked_list {

	public static void main(String[] args) 
	{
		Queuee q =new Queuee();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.show();
		System.out.println();
		System.out.println(q.deQueue());
		System.out.println();
		q.show();
	}

}
