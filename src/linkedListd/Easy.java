package linkedListd;

import java.util.HashSet;
import java.util.Set;


public class Easy {
	static ListNode head;
	static  class  ListNode{
		int data;
		ListNode next;
		ListNode(int d){
			
			data=d;
			next=null;
		}
	}
	 public void	insert(int n,int value){
		 ListNode p= new ListNode(value);
 	 	    int i;
if(n==1)
 	{
 	p.next=head;
 	head=p;
 	return;
 	}
  ListNode temp;
 	temp= head;
 	    for(i=1;i<n-1;i++){
 	            temp=temp.next;
 	    }
 	    p.next=temp.next;
 	    temp.next=p;
} public void delete(int n) {
	 
	 ListNode temp = head,prev=null;
	 if((temp!=null)&&(temp.data==n)) {
	 
	 head=temp.next ;
	 return ;
	 }
	 
	 
	 
	 while(temp.data!=n)
	 {
		 
		 prev=temp;
		 temp=temp.next;
	 }
	 
	 
	 if(temp.next==null)
	 {
		 return ;
	 }
	 
	 prev.next=temp.next;
}
public static void printed(){
	
ListNode temp =head ;
while(temp!=null)
{
  System.out.print(temp.data);
  temp=temp.next;
}
System.out.print("\n");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Easy list	= new Easy(); 
		list.head =new ListNode(1);
		ListNode two= new ListNode(2);
		ListNode three= new ListNode(3);
		
		list.head.next=two;
		two.next=three;
		list.printed();
		

		
		list.insert(3,6);
		list.printed();
		list.insert(3,7);
		list.printed();
		
		
		list.delete(1);
		list.printed();
		list.delete(2);	
		list.printed();
		list.delete(7);	
		list.printed();
		list.delete(6);	
		list.printed();
		list.delete(3);	
		list.printed();

		list.insert(1,1);
		list.insert(1,1);
		list.insert(1,1);
		list.insert(1,0);
		list.insert(1,1);
		list.insert(1,1);
		list.insert(1,0);
		list.insert(1,1);
		list.insert(1,1);
		list.insert(1,0);
		list.insert(1,1);
		list.insert(1,0);
		list.insert(1,1);
	
	
		list.printed();
		Boolean x=isPalindrome(list.head);
		System.out.println(x);
		list.printed();
	}
    public static int getDecimalValue(ListNode head) {
    	
    	 if(head==null)return 0;
    	 if(head.next==null)return head.data; 
    	StringBuilder con=new StringBuilder(); 
    	 ListNode temp =head ;
    	 while(temp.next!=null)
    	 {
    		 con.append(temp.data);
    	    temp=temp.next;
    	 }
    	 con.append(temp.data);
int d=Integer.parseInt(con.toString(),2); 
return d;
    }

    	    public static ListNode middleNode(ListNode head2) {
    	    	if(head2==null) {return null;}
    	    	if(head2.next==null)
    	    	{return head2;}
    	    	ListNode less = head2;
    	    	 ListNode more = head2.next;
    	    	while(more.next!=null)
    	    	{
    	    		more=more.next;
    	    		if(more.next!=null)
    	    		{
    	    			less=less.next;
    	    			more=more.next;	
    	    		}
    	    	}
    	    	
    	    	ListNode middle=less.next;
    	    	less.next=null;
    	    	return middle;

    }
    	    public static void deleteNode(ListNode node) {
    	        node.data = node.next.data;
    	        node.next = node.next.next;
    	    }
    	    
    	    
    	    
    	    public static ListNode reverseList(ListNode head) {
	 ListNode current =head,nexter=null,prev=null;
    		 
    		 
    		 while(current!=null)
    		 {
    			 nexter=current.next;
    			 current.next=prev;
    			 prev=current;
    			 current =nexter;
    			 
    		 }
    		 
    		 
    		 head =prev; 
    		 return head;
    	    }
    	    public ListNode mergeTwoLists(ListNode a, ListNode b) {
    	    		if(a==null)
    	    		{
    	    			return b;
    	    			
    	    		}
    	    		
    	    			if(b==null)
    	    			{
    	    				return a;	
    	    				
    	    			}
    	    			
    	    		
    	    		if(a.data>=b.data)
    	    		{

    	              b.next=  mergeTwoLists(a,b.next);	
    	              return b;
    	    			
    	    		}
    	    		else
    	    			if(a.data<=b.data)
    	    			{
    	    			a.next=	mergeTwoLists(a.next,b);
    	    			return a;
    	    			}
    	    		ListNode x= null;
    	    	return x;
    	    		
    	    	}
    	    	
    	    public static boolean hasCycle(ListNode h) {
    	        HashSet<ListNode> s= new HashSet<ListNode>(); 	
    		ListNode x=null;
    		while(h!=null) {
    			if(s.contains(h)){
    				x.next=null;
    	return true;

    			}
    			else {
    				s.add(h);
    				x=h;
    				h=h.next;
    			}
    		}
    		return false;
    	    }
    	    public static ListNode deleteDuplicates(ListNode head) {
    	        ListNode current = head;
    	        while (current != null && current.next != null) {
    	            if (current.next.data == current.data) {
    	                current.next = current.next.next;
    	            } else {
    	                current = current.next;
    	            }
    	        }
    	        return head;
    	        	}
    	    public static ListNode removeElements(ListNode head, int val) {
    	    	if(head==null)return null;
    ListNode a=head;
	    deleter(head,val);		
	    if(head==null)return null;
	    if(head.next==null&&head.data==val)return null;
	    if(head.data==val)return head.next;

	    return head;
    	    }

			private static void deleter(ListNode head2, int val) {
				// TODO Auto-generated method stub
				if(head2==null)return;
				if(head2.next==null) {if(head2.data==val)head2=null;return;}
				
				if(head2.next.data==val)
				{head2.next=head2.next.next;deleter(head2,val);}
				else {deleter(head2.next,val);}
			}
		    public ListNode getIntersectionNode(ListNode heada, ListNode headb) {
		    	ListNode headA=heada;
			    ListNode	headB=headb;
			    Set<ListNode>a= new HashSet<ListNode>();
			    	while(headA!=null) {
			    		a.add(headA);
			    		headA=headA.next;		    		
			    	}
			    	if(a.isEmpty())return null;
			    	
			    	while(headB!=null)
			    	{if(a.contains(headB))
			    		{return headB;}
			    	headB=headB.next;}
			    
			    return null;
			    }
		    public static boolean isPalindrome(ListNode head) {
		    String a="";
		     while(head!=null)
		     {
		    	 a=a+head.data+" ";
		    	 head=head.next;
		     }
		     String v[]=a.split(" ");
		     
		    for(int i=0;i<v.length;i++)
		    {
		    	if(!v[i].equals(v[v.length-1-i])) {return false;}
		    }
		    return true;
		    }
	    	    }