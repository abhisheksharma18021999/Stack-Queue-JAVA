package nov;
import java.util.*;

class queue_min
{
	
	int arr[]=new int[10];
	int n=0;
    public int size()
    {
    	return n;
    }
    public boolean isEmpty()
    {
    	return n==0;
    }
    public int getpeek()
    {
    	return arr[n-1];
    }
	public int remove()
	{

		return arr[--n];
	}
	
	public void insert(int a)
	{ 
	
		if(n==0)
		{
			arr[0]=a;
			n++;
			return;
		}
		int i;
		for(i=n-1;i>=0;i--)
			{
				if(a>arr[i])//max            //for min a>arr[i]
				{
					arr[i+1]=arr[i];
				}
				else
				{
					break;
				}		
		
	        }

		arr[i+1]=a;
		n++;
	
	
         }
	public void print()
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
public class min_priority {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		queue_min pq=new queue_min();
		pq.insert(5);
		pq.insert(9);
		pq.insert(7);
		pq.insert(2);
		pq.print();
		System.out.println();
		System.out.println(pq.size());
		System.out.println(pq.remove());

	}

}
