package stackandqueued;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Stack;

public  class Hard{
static class FreqStack {
    Map<Integer, Integer> freq;
    Map<Integer, Stack<Integer>> group;
    int maxfreq;

    public FreqStack() {
        freq = new HashMap();
        group = new HashMap();
        maxfreq = 0;
    }

    public void push(int x) {
        int f = freq.getOrDefault(x, 0) + 1;
        freq.put(x, f);
        if (f > maxfreq)
            maxfreq = f;

        group.computeIfAbsent(f, z-> new Stack()).push(x);
    }

    public int pop() {
        int x = group.get(maxfreq).pop();
        freq.put(x, freq.get(x) - 1);
        if (group.get(maxfreq).size() == 0)
            maxfreq--;
        return x;
    }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  FreqStack obj = new FreqStack();
//		  obj.push(5);
//		  int param_2 = obj.pop();
		  String[] h=  {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
		  String[] h1=  {"2","1","+","3","*"};
		//  System.out.println(removeKdigits("1432219",3));
		  
	}

    public static int evaluateExpr(Stack<Object> stack) {

        int res = 0;

        if (!stack.empty()) {
            res = (int) stack.pop();
        }

        // Evaluate the expression till we get corresponding ')'
        while (!stack.empty() && !((char) stack.peek() == ')')) {

            char sign = (char) stack.pop();

            if (sign == '+') {
                res += (int) stack.pop();
            } else {
                res -= (int) stack.pop();
            }
        }
        return res;
    }

    public static int calculate(String s) {

        int operand = 0;
        int n = 0;
        Stack<Object> stack = new Stack<Object>();

        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {

                // Forming the operand - in reverse order.
                operand = (int) Math.pow(10, n) * (int) (ch - '0') + operand;
                n += 1;

            } else if (ch != ' ') {
                if (n != 0) {

                    // Save the operand on the stack
                    // As we encounter some non-digit.
                    stack.push(operand);
                    n = 0;
                    operand = 0;

                }
                if (ch == '(') {

                    int res = evaluateExpr(stack);
                    stack.pop();

                    // Append the evaluated result to the stack.
                    // This result could be of a sub-expression within the parenthesis.
                    stack.push(res);

                } else {
                    // For other non-digits just push onto the stack.
                    stack.push(ch);
                }
            }
        }

        //Push the last operand to stack, if any.
        if (n != 0) {
            stack.push(operand);
        }

        // Evaluate any left overs in the stack.
        return evaluateExpr(stack);
    }
    public boolean find132pattern(int[] nums) {
Stack<Integer>c=new Stack<Integer>();
int[]min=new int[nums.length];
min[0]=nums[0];
     for(int i=1;i<nums.length;i++)
     {min[i]=Math.min(min[i-1], nums[i]);}
    	 for(int j=nums.length-1;j>=0;j--) 
    	 {
    		if(nums[j]>min[j]) {
    			while(!c.isEmpty()&&min[j]>=c.peek()) {c.pop();}
    			if(!c.isEmpty()&&nums[j]>c.peek()) {return true;}
    			c.push(nums[j]);
    		}
     }
    	return false;
    }
    public static String removeDuplicates(String s, int k) {
   	 if(s.length()<k) {return s;}
   	   Stack<Character>a=new Stack<Character>();
   	 Stack<Integer>b=new Stack<Integer>();
   	   int i=0;int t=0;
   	  
   	   while(i<s.length()) {
   		   if(a.isEmpty()||a.peek()!=s.charAt(i))
   		   { a.push(s.charAt(i));i++;t++;}
   		   else {t=b.pop();}
while(i<s.length()&&s.charAt(i)==a.peek()) {t++;i++;if(k==t) {t=0;}}
b.push(t);t=0;
if(b.peek()==0) {b.pop();a.pop();}
   	   }
   	 StringBuilder x=new StringBuilder ();
   	 while(!a.isEmpty()) {
   		 int u=b.pop();
   		 while(u!=0) {x.append(a.peek());u--;}a.pop();
   	 }
   	   return x.reverse().toString();
      }
    public static int[] nextGreaterElements(int[] nums) {
    	int res[]=new int[nums.length];
    	Stack<Integer>a=new Stack<Integer>();
    for(int i=2*nums.length-1;i>=0;i--) 
    {
    	while(!a.isEmpty()&&nums[i%nums.length]>=nums[a.peek()]) {a.pop();}
    	res[i%nums.length]=a.isEmpty()?-1:nums[a.peek()];
    	a.push(i%nums.length);
    	
    	System.out.print(a+" ");
    	System.out.println();
      	for(int v=0;v<nums.length;v++)
        	System.out.print(res[v]+" ");
    	System.out.println();
    }
    	
    	
    	return res;
    }
    public boolean isValid(String s) {
        if(s.charAt(0)!='a') {return false;}
  	   Stack<Character>a=new Stack<Character>();
  	   int i=0;int t=0;
  	    while(i<s.length()) {
  	    if(s.charAt(i)!='c') {a.add(s.charAt(i));}
  	    else
  	    {
  	    	if(a.size()>=2&&a.pop()=='b'&&a.pop()=='a') {}else {return false;}
  	    }
  	    	
  	    	i++;
  	    }
  	    return a.isEmpty()?true:false;
 }
    public int[] asteroidCollision(int[] ass) {
        Stack<Integer>a= new Stack<Integer>();
        int g=0;a.add(ass[g]);g++;
        while(g<ass.length) 
        {
            if(a.isEmpty()){a.add(ass[g++]);}
            if(g==ass.length){break;}
       	 if(a.peek()>0) {
       		 if(ass[g]>0) {a.add(ass[g]);}
       		 else {
       			 int f=Math.abs(ass[g]);
       			 while(!a.isEmpty()&&(!(a.peek()<0))&&a.peek()<f) {a.pop();}
       			 
       			 if(a.isEmpty()||a.peek()<0) {a.add(ass[g]);}
                    if(!a.isEmpty()&&a.peek()==f){a.pop();}
                    
       		 }
       		 
       	 }
       	 else
       		 if(a.peek()<=0) {
           		  a.add(ass[g]);
           	 }g++;
            System.out.println(a);
        }
        
        int []d=new int[a.size()];
        for(int  i=d.length-1;i>=0;i--) 
        {d[i]=a.pop();}
        return d;
       }
    
    public static String decodeString(String s) {
    	Stack<String> a= new Stack<String>();
    	Stack<Integer> b= new Stack<Integer>();
    	int c=0;int d=0,n=0;
    	while(c<s.length()) 
    	{
    	d=0;n=0;
    if(s.charAt(c)>='0'&&s.charAt(c)<='9')
    		{	while (Character.isDigit(s.charAt(c))) 
    		                  {
    			     // Forming the operand - in reverse order.
    			                 d = 10*d+ (int) (s.charAt(c) - '0');
    			                 c++;
    			                }
    			b.add(d);a.add("[");c++;
    		}
     else
    		{
    	         b.add(1);
    	    }
    
    
    
    		StringBuilder e=new StringBuilder();
 while(c!=s.length()&&(s.charAt(c)>='a'&&s.charAt(c)<='z'||s.charAt(c)>='A'&&s.charAt(c)<='Z'))
    		{
	 e.append(s.charAt(c));c++;
	        }
 
 
 a.add(e.toString());if(c==s.length()) {break;}
 
 
     if(s.charAt(c)>='0'&&s.charAt(c)<='9')
    	{continue;}   
     else {
    	              	while(s.charAt(c)==']')
    	                        {
    	int y=b.pop();
    	StringBuffer x= new StringBuffer();
    	x.append(a.pop());int g=x.length();
    	             for(int i=1;i<y;i++)
                        	{x.append(x.subSequence(0, g));}a.pop();
             if(!a.isEmpty())
            {x.insert(0, a.pop());}
    
        a.add(x.toString());c++;if(c==s.length())break;
        if((s.charAt(c)>='a'&&s.charAt(c)<='z'||s.charAt(c)>='A'&&s.charAt(c)<='Z'))
	{
	
        	StringBuilder r=new StringBuilder();
	             while(c!=s.length()&&(s.charAt(c)>='a'&&s.charAt(c)<='z'||s.charAt(c)>='A'&&s.charAt(c)<='Z'))
	{r.append(s.charAt(c));c++;}
	r.insert(0, a.pop());  a.add(r.toString());if(c==s.length())break;
	
	}
    	                        
    	                        }
    		}
    	}
    	
    	
    	
    StringBuilder q=new StringBuilder();
    while(!a.isEmpty()) 
    {
    	q.insert(0, a.pop());
    }
    System.out.println(q.toString());	
		return q.toString();
    }
    
    
    public static int evalRPN(String[] tokens) {
    	int g=0;
  	  Stack<Integer>a= new Stack<Integer>();
  	   while(g<tokens.length) 
  	   {
  		   while((g!=tokens.length)&&!(tokens[g].equals("+")||tokens[g].equals("-")||tokens[g].equals("*")||tokens[g].equals("/")))
  		   {int i=Integer.parseInt(tokens[g]);
  		   a.add(i);g++;}	
             if((g==tokens.length)){break;}
  		  gotyouth(a,tokens,g);
  		  
  		   g++;
  	   }
  		   
  		   
  		   return a.pop();     
  	    }

  	private static void gotyouth(  Stack<Integer>a,String[] tokens, int g) {
  				if(tokens[g].equals("+")) {int h=a.pop();a.add(a.pop()+h);return ;}
  			if(tokens[g].equals("-")) {int h=a.pop();a.add(a.pop()-h);return ;}
  			if(tokens[g].equals("*")) {int h=a.pop();a.add(a.pop()*h);return;}
  			if(tokens[g].equals("/")) {int h=a.pop();a.add(a.pop()/h);return;}
  	}//{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}
  	
    public String decodeAtIndex(String S, int K) {
    long size = 0;
    int N = S.length();

    // Find size = length of decoded string
    for (int i = 0; i < N; ++i) {
        char c = S.charAt(i);
        if (Character.isDigit(c))
            size *= c - '0';
        else
            size++;
    }

    for (int i = N-1; i >= 0; --i) {
        char c = S.charAt(i);
        K %= size;
        if (K == 0 && Character.isLetter(c))
            return Character.toString(c);

        if (Character.isDigit(c))
            size /= c - '0';
        else
            size--;
    }

    return null;
}
}