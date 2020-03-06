package STACK;
import java.util.*;
class stack
{
	int size;
	int a[];
	int top;
	int data;
	int capacity;
	public stack(int size)
	{
		capacity=size;
		a=new int[size];
		top=-1;
	}
	public boolean isFull()
	{
		if(top==capacity-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void push(int data)
	{
		
		if(isFull())
		{
			System.out.println("overfull");
		}
		else
		{
			
			a[top+1]=data;
			top++;
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.print("underflow");
			return -1;
		}
		else
		{
			top--;
			return a[top+1];
		}
	}
	public int peek()
	{
		return a[top];
	}
	public void show()
	{
		for(int i=0;i<top+1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

public class stack_area
{
	public static void main(String[] args) 
	{
		stack s=new stack(10);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		
		s.show();
		System.out.println();
		System.out.println(s.pop());
		System.out.println();
		s.show();
		System.out.println();
		System.out.println(s.peek());

	}

}
