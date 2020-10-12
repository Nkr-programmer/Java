package stackandqueued;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Easy {
	public static class CustomStack {
Stack<Integer>a;
int max;
	    public CustomStack(int maxSize) {
	        a=new Stack();
	        max=maxSize;
	    }
	    
	    public void push(int x) {
	        if(max>a.size())
	        {a.add(x);}
	        System.out.println(a);
	    }
	    
	    public int pop() {
	        return !a.isEmpty()?a.pop():-1;
	    }
	    
	    public void increment(int k, int val) {
	    	 for(int i=0; i< k && i < a.size();i++)
	    	    {
	    	        a.set(i,a.get(i)+val);
	    	    }
	    }
	}
	public static class CustomStack2 {
Deque<Integer>a;
int max;
	    public CustomStack2(int maxSize) {
	        a=new LinkedList();
	        max=maxSize;
	    }
	    
	    public void push(int x) {
	        if(max>a.size())
	        {a.addFirst(x);}
	        System.out.println(a);
	    }
	    
	    public int pop() {
	        return !a.isEmpty()?a.pop():-1;
	    }
	    
	    public void increment(int k, int val) {
	        k=k>max?max:k;
	        Stack<Integer>c= new Stack<Integer>();
	        while(a.isEmpty()&&k>0)
	        {
	        	c.add(a.pollLast()+val);k--;
	        }
	        while(!c.isEmpty())
	        {
	        	a.addLast(c.pop());
	        }
	    }
	}
 static	class StockSpanner {
	    Stack<Integer> prices, weights;

	    public StockSpanner() {
	        prices = new Stack();
	        weights = new Stack();
	    }
		    
		   
		  public int next(int price) {
	        int w = 1;
	        while (!prices.isEmpty() && prices.peek() <= price) {
	            prices.pop();
	            w += weights.pop();
	        }

	        prices.push(price);
	        weights.push(w);
	        return w;
	    }
	}
	public static class MinStack2 {
		  private Stack<Integer> stack;
		    private int min;
		    /** initialize your data structure here. */
		    public MinStack2() {
		        stack = new Stack<>();
		        min = Integer.MAX_VALUE;
		    }
		    
		    public void push(int x) {
		        if(x <= min){   // memorize the previous min by pushing it to the stack
		            stack.push(min);
		            min = x;
		        }
		        stack.push(x);
		        System.out.println(stack);
		    }
		    
		    public void pop() {
		        if(stack.pop() == min){
		            min = stack.pop();
		        }
		    }
		    
		    public int top() {
		        return stack.peek();
		    }
		    public int getMin() {
		        return min;
		    }
		}
	public static class MinStack {

	    /** initialize your data structure here. */
		PriorityQueue<Integer> a;
		Stack<Integer> c;
	    public MinStack() {
	        a=new PriorityQueue();
	        c= new Stack();
	    }
	    
	    public void push(int x) {
	        a.add(x);
	        c.add(x);
	    }
	    
	    public void pop() {
	        int g=c.pop();
	        a.remove(new Integer(g));
	    }
	    
	    public int top() {
	    	System.out.println(c);
	    	return c.peek();
	    }
	    
	    public int getMin() {
	    return   a.peek();
	    }
	}
	class MyQueue { 
	/** Initialize your data structure here. */
		Stack<Integer>a;
        Stack<Integer>b;
        int front;
		public MyQueue() {
        a= new Stack<Integer>();
        b=new Stack<Integer>();
        front =0;
		}
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(a.isEmpty()) {
        	front=x;
        }
        a.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	if(b.isEmpty()) {
    		while(!a.isEmpty())
    		{b.add(a.pop());}
    	}
		return b.pop();
    }
    
    /** Get the front element. */
    public int peek() {
		return b.isEmpty()? front:b.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
		return a.isEmpty()&&b.isEmpty();
        
    }
}

	class MyStack {

	    /** Initialize your data structure here. */
		Queue<Integer>a;
	    public MyStack() {
	        a=new LinkedList();
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	        a.add(x);
	        int c= a.size();
	        while(c>1) {
	        	a.add(a.remove());
	        	c--;
	        }
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
			return a.poll();
	    }
	    
	    /** Get the top element. */
	    public int top() {
			return a.peek();
	        
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
			return a.isEmpty();
	        
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MinStack2 obj = new MinStack2();
		  obj.push(-2);
		  obj.push(0);
		  obj.push(-3);
		  int param_4 = obj.getMin();
		  System.out.println(param_4);
		  obj.pop();
		  int param_3 = obj.top();
		  System.out.println(param_3);
		   param_4 = obj.getMin();
		  System.out.println(param_4);
		  
		   StockSpanner ob = new StockSpanner();
		   int param_1 = ob.next(100);
		   System.out.println(param_1);
		    param_1 = ob.next(80);
		    System.out.println(param_1);
		    param_1 = ob.next(60);
		    System.out.println(param_1);
		    param_1 = ob.next(70);
		    System.out.println(param_1);
		    param_1 = ob.next(60);
		    System.out.println(param_1);
		    param_1 = ob.next(75);
		    System.out.println(param_1);
		    param_1 = ob.next(85);
		    System.out.println(param_1);
		    
		     CustomStack o = new CustomStack(3);
		     o.push(1);                          // stack becomes [1]
		     o.push(2);                          // stack becomes [1, 2]
		     o.pop();                            // return 2 --> Return top of the stack 2, stack becomes [1]
		     o.push(2);                          // stack becomes [1, 2]
		     o.push(3);                          // stack becomes [1, 2, 3]
		     o.push(4);                          // stack still [1, 2, 3], Don't add another elements as size is 4
		     o.increment(5, 100);                // stack becomes [101, 102, 103]
		     o.increment(2, 100);                // stack becomes [201, 202, 103]
		     o.pop();                            // return 103 --> Return top of the stack 103, stack becomes [201, 202]
		     o.pop();                            // return 202 --> Return top of the stack 102, stack becomes [201]
		     o.pop();                            // return 201 --> Return top of the stack 101, stack becomes []
		     o.pop();  
		    
		     String s="lee(t(c)o)de)";
		     System.out.println(minRemoveToMakeValid(s));
	}

    public String removeOuterParentheses(String S) {
	if(S.isEmpty()) {return S;}
	Deque<Character> a= new LinkedList<Character>();
	int y=0;
	StringBuilder b= new StringBuilder();

	while(y<S.length()) {
		a.addFirst(S.charAt(y));y++;
	while(!a.isEmpty())
	{
		if(S.charAt(y)=='(')
		{
			a.addFirst(S.charAt(y));b.append(S.charAt(y));
		}
		else
			if(S.charAt(y)==')')
			{
				a.removeFirst();b.append(S.charAt(y));
			}
		y++;
	}
	b.deleteCharAt(b.length()-1);
	}
	
	
	return b.toString();
    
} public int calPoints(String[] ops) {
 if(ops.length==0)return 0;
     Stack<Integer>a= new Stack<Integer>();
     int f=0;
     for(int i=0;i<ops.length;i++)
     {
    if(ops[i].equals("C"))
    {a.pop();}
    else
    	if(ops[i].equals("D"))
        {a.add(2*a.peek());}
        else
        	if(ops[i].equals("+"))
            {
        		int z=a.pop();
        		z=z+a.peek();
        		a.add(z-a.peek());
        		a.add(z);
            }
            else
            { int y=Integer.parseInt(ops[i]);
            	a.add(y);
            }
            
    	
     }
     while(!a.isEmpty())
     {
          f=f+a.pop();
     }
	return f;
     
     
    }  public List<String> buildArray(int[] target, int n) {
        int j=0;
        List<String>a=new LinkedList<String>();
       	for(int i=1;i<=n;i++)
       	{
       		if(target[j]==i)
       		{a.add("Push");j++;}
       		else
       		{a.add("Push");a.add("Pop");}
       		
       		if(j==target.length) {break;}
       	}
       	return a;
       }
    public String removeDuplicates(String S) {
    	if(S.isBlank())return null;
	if(S.length()==1)return S;
 Stack<Character>a = new Stack<Character>();
 StringBuilder b=new StringBuilder();
 a.add(S.charAt(0));b.append(S.charAt(0));
 for(int i=1;i<S.length();i++)
 {
	 if(!a.isEmpty()&&a.peek()==S.charAt(i)) {
         a.pop();
         b.deleteCharAt(b.length()-1);}
	 else
	 {a.add(S.charAt(i));b.append(S.charAt(i));}
 }
 
	
	return b.toString();
}
	
    public boolean backspaceCompare(String S, String T) {
    	int x=0,y=0;
    	Stack<Character>a=new Stack<Character>();
    	Stack<Character>b=new Stack<Character>();
    	while(x<S.length()) {
    		if(S.charAt(x)=='#') {
    			if(!a.isEmpty())a.pop();}
    		else
    		a.add(S.charAt(x));x++;}
    	while(y<T.length()) {
    		if(T.charAt(y)=='#') {
    			if(!a.isEmpty())b.pop();}
		else
    		b.add(T.charAt(y));y++;}
    	if(a.equals(b))return true;
    	else
		return false;
    }
    	  public int minAddToMakeValid(String S) {
          	Stack <Character>a= new Stack<Character>();
      	int g=0;
      	while(g<S.length())
      	{
      		if(S.charAt(g)=='(') {a.add('(');}
      		else
      			if(S.charAt(g)==')') {
      				if(!a.isEmpty()&&a.peek()=='(')
      				a.pop();
      				else
      					a.add(')');
      			}
      		g++;
      	}
      	
  		return a.size();
          
      }
    	  public int scoreOfParentheses(String S) {
    		  int ans = 0, bal = 0;
    	        for (int i = 0; i < S.length(); ++i) {
    	            if (S.charAt(i) == '(') {
    	                bal++;
    	            } else {
    	                bal--;
    	                if (S.charAt(i-1) == '(')
    	                    ans += 1 << bal;
    	            }
    	        }

    	        return ans;
    	    }
    
    	   public static String reverseParentheses(String s) {
    	 Stack<Character>a= new Stack<Character>();
    	 int i=0;
       	 while(i<s.length())
    	 {
if(s.charAt(i)==')') {
	 Queue<Character>b= new LinkedList<Character>();
	while(a.peek()!='(') {b.add(a.pop());}a.pop();
	while(!b.isEmpty()) {a.add(b.poll());}
}else
{
a.add(s.charAt(i));	
}
    	i++;	 
    	 }
       	 StringBuilder st=new StringBuilder ();
    	  while(!a.isEmpty()) {st.append(a.pop());}
    	 return st.reverse().toString();
    	   }
    	   
   public static class king{
	   char b;
	   int a;
	   king(char x,int y){
		   this.b=x;
		   this.a=y;
	   }
   } 
    	   
    	   
   public static String minRemoveToMakeValid(String s) {
   	Stack <Integer>b= new Stack<Integer>();
	int i=0;
	while(i<s.length())
	{

		if(s.charAt(i)=='(') {
			b.add(i);
		}
		else
			if(s.charAt(i)==')') {
				if(!b.isEmpty()&&s.charAt(b.peek())=='(') {b.pop();}
					else {b.add(i);}
			}
		i++;
	}
	StringBuilder x= new StringBuilder();
	i=s.length()-1;
	while(i>=0){
		if(!b.isEmpty()&&b.peek()==i) {
			b.pop();
		}else
		x.append(s.charAt(i));
		i--;
	}
    	  		return x.reverse().toString();
   }
}