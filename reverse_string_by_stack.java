package STACK;
import java.util.*;

public class string_rev 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		Stack<Character> ss=new Stack<>();
		String updated="";
		
		for(int i=0;i<s.length();i++)
		{
			ss.add(s.charAt(i));
		}

		for(int i=0;i<s.length();i++)
		{
			updated=updated+ss.pop();
		}
		System.out.println(updated);
	}

}
