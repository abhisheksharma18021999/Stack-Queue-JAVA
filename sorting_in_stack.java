package STACK;



import java.util.*;

public class sorting_in_stack{
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
       sort(stack);
    }

   
    static void sort(Stack<Integer> stack) {
 
        Stack<Integer>temp=new Stack<Integer>();
        while(!stack.isEmpty())
        {
            int n=stack.pop();
            while(!temp.isEmpty() && temp.peek()>n)
            {
                stack.push(temp.pop());
            }
            temp.push(n);
        }
        System.out.println(temp);
    }
}
