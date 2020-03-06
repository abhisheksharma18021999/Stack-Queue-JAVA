package queeue;
import java.util.*;
class queue
{
static	int size;
static 	int capacity;
static	int front,rear;
static int a[];
	queue(int size)
	{
		capacity=size;
		front=rear=0;
		a=new int[size];
	}
	public void enQueue(int data)
	{
		if(capacity==rear)
		{
			System.out.println("overFLOW");
			return;
		}
		else
		{
			a[rear]=data;
			rear++;
		}
		return;
	}
	static int deQueue()
	{
		if(front==rear)
		{
			System.out.println("underFLOW");
			return -1;
		}
		else
		{
			int ex=a[0];
			for(int i=0;i<rear;i++)
			{
				a[i]=a[i+1];
			}
			rear--;
			return ex;
		}
	}
	  static void show() 
	    { 
	        int i; 
	        if (front==rear) { 
	            System.out.printf("\nQueue is Empty\n"); 
	            return; 
	        } 
	  
	        // traverse front to rear and print elements 
	        for (i = front; i < rear; i++) { 
	            System.out.printf(" %d <-- ", a[i]); 
	        } 
	        return; 
	    } 
}

public class queue_array
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		queue q=new queue(10);
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.show();
		System.out.println();
		System.out.println(q.deQueue());
		System.out.println();
		q.show();

	}

}
