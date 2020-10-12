package stackandqueued;

import java.util.Stack;

public class Medium {
	public static class MyCircularQueue {
		public int
		size =1000;
		int top;
		int rear;
		int a[]=new int[size];
		    /** Initialize your data structure here. Set the size of the queue to be k. */
		    public  MyCircularQueue(int k) {
		    size=k;
              
		    	top=-1;
				rear =-1;
		    }
		    
		    /** Insert an element into the circular queue. Return true if the operation is successful. */
		    public boolean enQueue(int data) {
		    	if(rear==size-1)
		    	{if(top!=0) {rear=0;a[rear]=data;return true;}
                 else return false;
		    	}
		    	else 
		    		if(rear==top&&top==-1)
		    	{
		    	a[++rear]=data;
		    	top++;
		    	}else
		    	if(rear+1==top) {
		    	return false;
		    	}
		    		else {
		    			a[++rear]=data;
		    		}
				return true;
		    }
		    
		    /** Delete an element from the circular queue. Return true if the operation is successful. */
		    public boolean deQueue() {
if(top==rear&&top==-1)return false;
                  if(top==rear)
           {top=-1;rear=-1;return true;}
int x;
x=a[top++];
if(top==size)
{top=0;return true;}
         
	
return true;		        
		    }
		    
		    /** Get the front item from the queue. */
  public int Front() {
		    	if(top==-1)return -1;
		    		return a[top];
		    }
		    
		    /** Get the last item from the queue. */
		    public int Rear() {
		    	if(rear==-1)return -1;
		    	return a[rear];    
		    }
		    
		    /** Checks whether the circular queue is empty or not. */
		    public boolean isEmpty() {
		    	if(top==rear&&top==-1)
		    	{
		    	return true;
		    	}
		    		
		    		return false;
		        
		    }
		    
		    /** Checks whether the circular queue is full or not. */
		    public boolean isFull() {
		    	if(rear==size-1&&top==0)
		    	{
		    	return true;
		    	}
		    	if(top-1==rear)
		    	{
		    	return true;
		    	}
		    		  		return false;
		    }
		}
	static class MyCircularDeque {
		public int
		size =1000;
		int top;
		int rear;
		int a[]=new int[size];
	    /** Initialize your data structure here. Set the size of the deque to be k. */
	    public MyCircularDeque(int k) {
	    	  size=k;
              
		    	top=-1;
				rear =-1;  
	    }
	    
	    /** Adds an item at the front of Deque. Return true if the operation is successful. */
	    public boolean insertFront(int data) {
	    	if(rear==size-1)
	    	{if(top!=0) {rear=0;a[rear]=data;return true;}
             else return false;
	    	}
	    	else 
	    		if(rear==top&&top==-1)
	    	{
	    	a[++rear]=data;
	    	top++;
	    	}else
	    	if(rear+1==top) {
	    	return false;
	    	}
	    		else {
	    			a[++rear]=data;
	    		}
			return true;
	    }
	    
	    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
	    public boolean insertLast(int data) {
	      	if(top==0)
	    	{if(rear!=size-1) {top=size-1;a[top]=data;return true;}
             else return false;
	    	}
	    	else 
	    		if(rear==top&&top==-1)
	    	{
	    	a[++top]=data;
	    	rear++;
	    	}else
	    	if(rear+1==top) {
	    	return false;
	    	}
	    		else {
	    			a[--top]=data;
	    		}
			return true;
	    }
	    
	    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
	    public boolean deleteFront() {
	      	if(top==rear&&top==-1)return false;
            if(top==rear)
     {top=-1;rear=-1;return true;}
int x;
x=a[rear--];
if(rear==-1)
{rear=size-1;return true;}
return true;       
	    }
	    
	    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
	    public boolean deleteLast() {
	    	if(top==rear&&top==-1)return false;
            if(top==rear)
     {top=-1;rear=-1;return true;}
int x;
x=a[top++];
if(top==size)
{top=0;return true;}
return true;      
	    }
	    
	    /** Get the front item from the deque. */
	    public int getFront() {
	    	if(rear==-1)return -1;
	    	System.out.println(a[rear]);
    		return a[rear];
	    }
	    
	    /** Get the last item from the deque. */
	    public int getRear() {
	    	if(top==-1)return -1;
	    	System.out.println(a[top]);
	    	return a[top];
	    }
	    
	    /** Checks whether the circular deque is empty or not. */
	    public boolean isEmpty() {
	    	if(top==rear&&top==-1)
	    	{
	    	return true;
	    	}
	    		return false;
	    }
	    
	    /** Checks whether the circular deque is full or not. */
	    public boolean isFull() {
	      	if(rear==size-1&&top==0)
	    	{
	    	return true;
	    	}
	    	if(top-1==rear)
	    	{
	    	return true;
	    	}
	    		return false;
	    }
	}
//	["MyCircularDeque","insertFront","insertLast","getFront","insertLast","getFront","insertFront",
	//"getRear","getFront","getFront","deleteLast","getRear"]
//			[[5],[7],[0],[],[3],[],[9],[],[],[],[],[]]
public static void main(String[] args) {
		// TODO Auto-generated method stub
//	  MyCircularDeque obj = new MyCircularDeque(5);
//	  boolean param_1 = obj.insertFront(7);
//	  boolean param_2 = obj.insertLast(0);
//	  int param_7 = obj.getRear();
//	  boolean param_3 = obj.insertLast(3);
//	  int param_77 = obj.getFront();
//	  boolean param_4 = obj.insertLast(9);
//	  int param_5 = obj.getRear();
//	  int param_6 = obj.getFront();
//	  boolean param_71 = obj.deleteLast();
//	  int param_8 = obj.getRear();
	int y=  minInsertions2("(()))(()))()())))");
	}
//when )) are not consecutive;
public static int minInsertions(String s) {
   	Stack <Character>b= new Stack<Character>();
	int i=0;
	while(i<s.length())
	{
	if(i<s.length()&&s.charAt(i)==')')
	{
		while(i<s.length()&&s.charAt(i)==')')
		{
			if(b.size()>=2&&b.get(b.size()-1)==')'&&b.get(b.size()-2)=='(') {b.pop();b.pop();}
			else {b.add(')');}i++;
		}
		}
		else {b.add('(');i++;}
	}
	if(b.size()==0) {return 0;}
	int e=0;
	while(!b.isEmpty()) 
	{
		if(b.size()>=2&&b.get(b.size()-1)==')'&&b.get(b.size()-2)=='(') {b.pop();b.pop();e++;}
		else
			if(b.size()>=2&&b.get(b.size()-1)==')'&&b.get(b.size()-2)==')') {b.pop();b.pop();e++;}
			else
				if(b.size()>=1&&b.get(b.size()-1)==')') {b.pop();e=e+2;}
				else
				{b.pop();e=e+2;}
	}
	System.out.println(e);
	return e;
	}


//res represents the number of left/right parentheses already added.
//right represents the number of right parentheses needed.
//  for consecutive ))    "(()))(()))()())))"
public static int minInsertions2(String s) {
    int res = 0, right = 0;
    for (int i = 0; i < s.length(); ++i) {
        if (s.charAt(i) == '(') {
            if (right % 2 > 0) {
                right--;
                res++;
            }
            right += 2;
        } else {
            right--;
            if (right < 0) {
                right += 2;
                res++;
            }
        }
    }
    System.out.println(res+right);
    return right + res;
}
public String removeKdigits(String num, int k) {
    int len = num.length();
   //corner case
   if(k==len)        
       return "0";
       
   Stack<Character> stack = new Stack<>();
   int i =0;
   while(i<num.length()){
       //whenever meet a digit which is less than the previous digit, discard the previous one
       while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
           stack.pop();
           k--;
       }
       stack.push(num.charAt(i));
       i++;
   }
   
   // corner case like "1111"
   while(k>0){
       stack.pop();
       k--;            
   }
   
   //construct the number from the stack
   StringBuilder sb = new StringBuilder();
   while(!stack.isEmpty())
       sb.append(stack.pop());
   sb.reverse();
   
   //remove all the 0 at the head
   while(sb.length()>1 && sb.charAt(0)=='0')
       sb.deleteCharAt(0);
   return sb.toString();
}

}