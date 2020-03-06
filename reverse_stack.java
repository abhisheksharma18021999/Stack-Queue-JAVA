package STACK;
import java.util.Stack; 

class rev_stack { 

	static Stack<Character> st = new Stack<>(); 
	
 
	public void reverse() 
	{ 
   char arr[]=new char[st.size()];
   int sss=st.size();
   for(int i=0;i<sss;i++)
   {
     arr[i]=st.peek();
     st.pop();
   }
   for(int i=0;i<sss;i++)
   {
     st.push(arr[i]);
   }
   
} 
	public static void main(String[] args) 
	{ 
		rev_stack aa =new rev_stack();
		st.push('1'); 
		st.push('2'); 
		st.push('3'); 
		st.push('4'); 
		
		System.out.println("Original Stack"); 
		
		System.out.println(st);  
		aa.reverse(); 
		
		System.out.println("Reversed Stack"); 
		
		System.out.println(st); 
	} 
} 
