package STACK;
import java.util.*;


class sd
{
	 Queue<Integer> q1 = new LinkedList<Integer>();
     Queue<Integer> q2 = new LinkedList<Integer>();
     
     public void push(int data)
     {
    	 q2.add(data);
    	 while(!q1.isEmpty())
    	 {
    		 q2.add(q1.peek());
    		 q1.remove();
    	 }
    	 Queue<Integer> q=q1;
    	 q1=q2;
    	 q2=q;
     }
     public int pop()
     {
	     if (q1.isEmpty()) 
             return -1; 
     return    q1.remove(); 
         
     }
     public void show()
     {
    	 System.out.println(q1);
     }
	
	
}

public class stack_by_twoQueue
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sd s = new sd(); 
        s.push(1); 
        s.push(2); 
        s.push(3); 
        s.push(4);
        s.push(5);
  
        s.show();
        
        s.pop(); 
        
        s.pop(); 
        
        s.show();
        
  
        
	}

}
