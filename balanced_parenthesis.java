
// balanced Parenthesis 
package STACK;
import java.util.*;

public class balanced_parenthesis
{ 
	static boolean match(char c1,char c2)
	{
		if(c1=='('&&c2==')')
		{
			return true;
		}
		else if(c1=='['&&c2==']')
		{
			return true;
		}
		else if(c1=='{'&&c2=='}')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static boolean check(char a[])
	{
		Stack<Character> s=new Stack<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='('  ||  a[i]=='['  ||   a[i]=='{') 
			{
				s.push(a[i]);
			}
			if(a[i]==')'  ||  a[i]==']'  ||   a[i]=='}') 
			{
				if(s.isEmpty())
				{
					return false;
				}
				else if(!match(s.pop(),a[i]))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	/*driver program to test above functions*/
	public static void main(String[] args) 
	{ 
		char exp[] = {'{','(',')','}',']'}; 
		if (check(exp)) 
			System.out.println("Balanced "); 
		else
			System.out.println("Not Balanced "); 
	} 

} 
