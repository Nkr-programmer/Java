package linkedListd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import linkedListd.Easy.ListNode;



 
public class Medium {
	public static class Node {
	    public int val;
	    public Node prev;
	    public Node next;
	    public Node child;
	};
	public static class Nodes {
	    public int val;
	    public Nodes next;
	    public Nodes random;
	    Nodes() {}
	    Nodes(int val) { this.val = val; }
	    Nodes(int val, Nodes next,Nodes random) { this.val = val; this.next = next;this.random = random; }
	};
	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	     ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	   public static class TreeNode {
		       int val;
		       TreeNode left;
		       TreeNode right;
		       TreeNode() {}
		       TreeNode(int val) { this.val = val; }
		       TreeNode(int val, TreeNode left, TreeNode right) {
		           this.val = val;
		           this.left = left;
		           this.right = right;
		       }
		   }
		  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode a=new ListNode();
	
		int []ab= new int[5];
	ab=	nextLargerNodes(a);
	}
	   public static int[] nextLargerNodes(ListNode head) {
		   
		if(head==null)return null;
		 int[] q= new int [1];q[0]=0;
		if(head.next==null)return q;
		   ListNode got=head,mot=head;
		   ArrayList<Integer>a= new ArrayList<Integer>();
		   while(got!=null) {
			   
			   while(mot!=null&&mot.val<=got.val) {mot=mot.next;}
			   if(mot==null) {
				   a.add(0);
			   }
			   else {
				   a.add(mot.val);
			   }
			   got= got.next;
			   mot=got;
		   }
		   int[] c= new int [a.size()];
		   for(int i=0;i<a.size();i++)
		   {
			   c[i]=a.get(i);
		   }
		 
		return c;
		    
	    }
	    public int numComponents(ListNode head, int[] G) {
			if(head==null)return 0;
			if(G.length==0) {return 0;}
	    	HashMap<Integer,Integer>v= new  HashMap<Integer,Integer>();int y=0;
	    	HashMap<Integer,Integer>vi= new  HashMap<Integer,Integer>();int yi=0;
	    
	    	ListNode got= head;
	    	while(got!=null)
	    	{v.put(y,got.val);y++;
	    		got=got.next;
	    	}
	       	
	       for(int i=0;i<G.length;i++) {vi.put(G[i],0);yi++;}
	  
	       	int q=0;
	    	Boolean  h=false;
	    	for(int g=0;g<v.size();g++)
	    	{
	    		while(vi.containsKey(v.get(g)))
	    		{g++;h=true;
	    		}
	    		if(h) {q++;h=false;}
	    		
	    	}
	    	
	    	
			return q;
	        
	    }
	  
	        public ListNode oddEvenList(ListNode head) {
	        	 if(head==null)return null;
		        	if(head.next==null)return head;
		        	if(head.next.next==null)return head;
		         ListNode had=head,pad=head.next,kad=head;
		         while(kad.next!=null)
		         {
		        	 kad=kad.next;had.next=had.next.next;had=kad;}
		         had=head;
		         while(had.next!=null) {had=had.next;}
		         had.next=pad;
		        
		         return head;
		        }

	        public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
	          ListNode f=l1;ListNode u=l2;
	        
	        Stack<Integer> a= new Stack<Integer>();
	        Stack<Integer> b= new Stack<Integer>();
	        while(f!=null) {a.add(f.val);
	      	  f=f.next;
	        }
	        while(u!=null) {b.add(u.val);
	    	  u=u.next;}
	        int r=a.size()>b.size()?a.size():b.size();
	    int []ab=new int[r+1];

	    for(int i=0;i<r;i++)
	    {
	    	if(!a.isEmpty()&&!b.isEmpty()) {
	    ab[i]=ab[i]+a.pop()+b.pop();
	    if(ab[i]>9) {ab[i+1]=1;}
	          ab[i]=ab[i]%10;
	    	}
	    	else
	    		if(a.isEmpty())
	    	{
	    			ab[i]=ab[i]+b.pop();
	    			if(ab[i]>9) {ab[i+1]=1;} ab[i]=ab[i]%10;
	    	}
	    		else	if(b.isEmpty())
	    	{
	    			ab[i]=ab[i]+a.pop();
	    			if(ab[i]>9) {ab[i+1]=1;} ab[i]=ab[i]%10;
	    	}
	    			
	    }
	        int g=r;
	        ListNode l3=null,q;
	        ListNode z=new ListNode();
	                if(ab[g]!=0) {
	      	  l3=new ListNode(ab[g]);g--;
	      	  q=l3;
	        } else{g--;
	        l3=new ListNode(ab[g]);g--;
	        q=l3;}
	        while(g>=0) {
	      	  q.next=new ListNode(ab[g]);g--;
	      	  q=q.next;
	        }

	        
	        
	    	return l3;
	      }
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode f=l1;ListNode u=l2;
    
    Stack<Integer> a= new Stack<Integer>();
    Stack<Integer> b= new Stack<Integer>();
    while(f!=null) {a.add(f.val);
  	  f=f.next;
    }
    while(u!=null) {b.add(u.val);
	  u=u.next;}
    int r=a.size()>b.size()?a.size():b.size();
int []ab=new int[r+1];

for(int i=0;i<r;i++)
{
	if(!a.isEmpty()&&!b.isEmpty()) {
ab[i]=ab[i]+a.pop()+b.pop();
if(ab[i]>9) {ab[i+1]=1;}
      ab[i]=ab[i]%10;
	}
	else
		if(a.isEmpty())
	{
			ab[i]=ab[i]+b.pop();
			if(ab[i]>9) {ab[i+1]=1;} ab[i]=ab[i]%10;
	}
		else	if(b.isEmpty())
	{
			ab[i]=ab[i]+a.pop();
			if(ab[i]>9) {ab[i+1]=1;} ab[i]=ab[i]%10;
	}
			
}
    int g=r;
    ListNode l3=null,q;
    ListNode z=new ListNode();
    long k= ab[g]; 
    l3=new ListNode((int)k);g--;
    q=l3;
    while(g<r) {
  	  q.next=new ListNode(ab[g]);g--;
  	  q=q.next;
    }
    if(ab[r]!=0) {
  	  q.next=new ListNode(ab[g]);g--;
  	  q=q.next;
    }
    
    
	return l3;
  }
public ListNode removeNthFromEnd(ListNode head, int n) {
	if(head==null)return null;
	if(head.next==null&&n==0)return head;
	if(head.next==null&&n==1)return null;
	int g=0;
	ListNode f=head,uk=head;
	while(f!=null) {g++;
		f=f.next;
	}
	
	if(g==n) {
		head=head.next;return head;
	}
	for(int i=0;i<g-n-1;i++) {uk=uk.next;}
	uk.next=uk.next.next;
	
	
	return head;
}
public ListNode deleteDuplicates(ListNode head) {
	   ListNode p=head;
       ListNode c;
       while(p!=null && p.next!=null)
       {
           if(p.val==p.next.val){// to remove duplicates at start.
               do
                   p.next=p.next.next;
               while(p.next!=null && p.val==p.next.val);
               if(p==head)
                   head=p.next;
               p=p.next;
           }else{ // to remove internal duplicates.
               c=p.next;
               if(c.next!=null && c.val==c.next.val){
                   do
                       c.next=c.next.next;
                   while(c.next!=null && c.val==c.next.val);
                   p.next=c.next;  
               }else
                   p=p.next;
           }
       }
       
       return head;
}
public ListNode swapPairs(ListNode head) {
	if(head==null)return null;
	if(head.next==null)return head;
	
 ListNode a=head;
 head=head.next;
 a.next=a.next.next;
 head.next=a;
 if(a.next==null) {return head;}
 if(a.next.next==null) {a=a.next;return head;}
 ListNode heads=a.next;a.next=a.next.next;a=heads;
 while(a.next!=null&&a!=null) {
	 heads=heads.next;
	 a.next=a.next.next;
	 heads.next=a;	 
	 if(a.next==null) {break;}
	 if(a.next.next==null) {a=a.next;break;}
	 heads=a.next;a.next=a.next.next;a=heads;
 }
 return head;
}
///////
ListNode tail = new ListNode();
ListNode nextSubList = new ListNode();

public ListNode sortList(ListNode head) {
    if (head == null || head.next == null)
        return head;
    int n = getCount(head);
    ListNode start = head;
    ListNode dummyHead = new ListNode();
    for (int size = 1; size < n; size = size * 2) {
        tail = dummyHead;
        while (start != null) {
            if (start.next == null) {
                tail.next = start;
                break;
            }
            ListNode mid = split(start, size);
            merge(start, mid);
            start = nextSubList;
        }
        start = dummyHead.next;
    }
    return dummyHead.next;
}

ListNode split(ListNode start, int size) {
    ListNode midPrev = start;
    ListNode end = start.next;
    //use fast and slow approach to find middle and end of second linked list
    for (int index = 1; index < size && (midPrev.next != null || end.next != null); index++) {
        if (end.next != null) {
            end = (end.next.next != null) ? end.next.next : end.next;
        }
        if (midPrev.next != null) {
            midPrev = midPrev.next;
        }
    }
    ListNode mid = midPrev.next;
    midPrev.next = null;
    nextSubList = end.next;
    end.next = null;
    // return the start of second linked list
    return mid;
}

void merge(ListNode list1, ListNode list2) {
    ListNode dummyHead = new ListNode();
    ListNode newTail = dummyHead;
    while (list1 != null && list2 != null) {
        if (list1.val < list2.val) {
            newTail.next = list1;
            list1 = list1.next;
            newTail = newTail.next;
        } else {
            newTail.next = list2;
            list2 = list2.next;
            newTail = newTail.next;
        }
    }
    newTail.next = (list1 != null) ? list1 : list2;
    // traverse till the end of merged list to get the newTail
    while (newTail.next != null) {
        newTail = newTail.next;
    }
    // link the old tail with the head of merged list
    tail.next = dummyHead.next;
    // update the old tail to the new tail of merged list
    tail = newTail;
}

static int getCount(ListNode head) {
    int cnt = 0;
    ListNode ptr = head;
    while (ptr != null) {
        ptr = ptr.next;
        cnt++;
    }
    return cnt;
}

public static ListNode reverseBetween(ListNode head, int m, int n) {
    ListNode current =head,nexter=null,prev=null;
		ListNode v=null;
 for(int i=1;i<m;i++) {v=current;
                       current=current.next;}
		 ListNode copy=current;
		 int j=n-m+1;
		 while(j>0)
		 {
			 nexter=current.next;
			 current.next=prev;
			 prev=current;
			 current =nexter;
			 j--;
		 }
        if(v!=null){
		 v.next=prev;
        }
        else
        {
            head=prev;
        }
		 copy.next=nexter;
		 return head;
	    }

public ListNode partition(ListNode head, int x) {

	  ListNode before_head = new ListNode(0);
      ListNode before = before_head;
      ListNode after_head = new ListNode(0);
      ListNode after = after_head;

      while (head != null) {
      if (head.val < x) {
              before.next = head;
              before = before.next;
          } else {
      after.next = head;
              after = after.next;
          }
          head = head.next;
      }
     after.next = null;
      before.next = after_head.next;
return before_head.next;
  }
        public ListNode rotateRight(ListNode head, int k) {
           	if(head==null)return head;
        	if(head.next==null)return head;
int n=getCount(head);
if(k==n) {return head;}
if(k>n) {k=k%n;}
          if(k==0)return head;
k=n-k;
if(k==0)return head;

ListNode f=head;
int d=1;
while(d!=k) {
f=f.next;d++;	
}
ListNode x=f.next;
f.next=null;
f=x;
while(x.next!=null)
{x=x.next;}
x.next=head;
head=f;
       return head; 	
   }
        public void reorderList(ListNode head) {
           	if(head==null)return;
        	if(head.next==null)return ;
         Deque<ListNode> a= new LinkedList<ListNode>();
         ListNode f= head;
         while(f!=null) {
        	 a.addFirst(f);
        	 f=f.next;
         }
         ListNode r=a.pollLast();
         while(!a.isEmpty())
         {
        	 
        	 r.next=a.pollFirst();r=r.next;
        	 if(a.isEmpty()) {
        		 r.next=null;break;
        	 }
        	 r.next=a.pollLast();r=r.next;
         }
        	
        	
        }
	    public static ListNode detectCycle(ListNode h) {
	        HashSet<ListNode> s= new HashSet<ListNode>(); 	
		ListNode x=null;
		while(h!=null) {
			if(s.contains(h)){
				x.next=null;
	return h;

			}
			else {
				s.add(h);
				x=h;
				h=h.next;
			}
		}
		return null;
	    }
	    public ListNode[] splitListToParts(ListNode root, int k) {
	    	ListNode[] fo=new ListNode[k];
           	if(root==null)return fo;	
   	if(k==1) {fo[0]=root;return fo;}
   	int n=getCount(root),m=0;
   	if(k>=n) {
   		ListNode y=root.next;
   		while(root!=null) {
   			fo[m]=root;
   			root.next=null;
   			root=y;
            if(y==null){break;}
            y=y.next;
   			m++;
   		}
   		return fo;
   	}
   	else
   	{
   	int mo=n%k,di=n/k,m1=0;
   		ListNode y=root;
   		while(root!=null)
   		{
   			int h=1;
   			fo[m1]=root;
   			while(h<di) {
   				y=y.next;h++;
   			}
   			if(mo>0) {
   				y=y.next;mo--;
   			}

				ListNode r=y.next;y.next=null;
				y=r;
				root=y;
				m1++;
   		}
   		return fo;
   	}
	    }
	    
	    public static boolean checking(ListNode head,TreeNode root)
	    {
	        if(head==null)
	            return true;
	        if(root==null)
	            return false;            
	        if(root.val!=head.val)
	            return false;
	        return(checking(head.next,root.left)||checking(head.next,root.right));
	    }
	    public boolean isSubPath(ListNode head, TreeNode root) {
	        if(root==null || head==null)
	            return false;
	        if(root.val==head.val && checking(head,root))
	            return true;
	        return (isSubPath(head,root.left)||isSubPath(head,root.right));
	    }
	    //iteratively
	    public ListNode insertionSortList(ListNode head) {
	        if (head == null || head.next == null) {
	            return head;
	        }
	        ListNode p, dummy = new ListNode(0), node = head;
	        dummy.next = head;
	        while (node.next != null) {
	            if (node.val > node.next.val) {
	                p = dummy;
	                while (p.next != null && p.next.val < node.next.val) {
	                    p = p.next;
	                }
	                ListNode nxt = node.next.next;
	                node.next.next = p.next;
	                p.next = node.next;
	                node.next = nxt;
	            } else {  // already sorted
	                node = node.next;
	            }
	        }
	        return dummy.next;
	    }

	    // recursively
	    public ListNode insertionSortList1(ListNode head) {
	        if (head == null || head.next == null) {
	            return head;
	        }
	        ListNode p = insertionSortList(head.next);
	        if (head.val <= p.val) {  // already sorted
	            head.next = p;
	            return head;
	        }
	        ListNode ret = p;
	        while (p.next != null && p.next.val < head.val) {
	            p = p.next;
	        }
	        head.next = p.next;
	        p.next = head;
	        return ret;
	    }
	    
	    //Sortedlist to binary search tree
	    public TreeNode helper(ListNode head,ListNode tail){
	        ListNode slow = head;
	        ListNode fast = head;
	        if(head == tail){
	            return null;
	        }
	        while(fast != tail && fast.next != tail){
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        TreeNode root = new TreeNode(slow.val);
	        root.left =  helper(head,slow);
	        root.right = helper(slow.next,tail);
	        return root;
	        
	    }
	    public TreeNode sortedListToBST(ListNode head) {
	       if(head == null){
	           return null;
	       } 
	       return helper(head,null);
	        
	    }
	    public Node flatten(Node head) {
	    	if(head==null)return head;
	    	if(head.next==null&&head.child==null)return head;
	    	
      Deque<Node> a= new LinkedList<Node>();
	    Node r=head;
	    
	  
	    while(r.next==null&&r.child!=null)
	    {
		    r.next=r.child;
		    r.child.prev=r;
		    r.child=null;r=r.next;
	    }
	    
	    
	    
	    while(r.next!=null) {
	    while(r.next!=null&&r.child==null) {r=r.next;}
	    if(r.next!=null) {
	    Node p=r.next;
	    r.next=null;
	    p.prev=null;
	    a.addLast(p);
	    r.next=r.child;
	    r.child.prev=r;
	    r.child=null;r=r.next; }
        
        while(!a.isEmpty()&&r.next==null){ Node t=a.pollLast();
	    r.next=t;
	    t.prev=r;r=r.next;
            }
        }
	    
	    return head;
	    }

	    public ListNode mergeKLists(ListNode[] lists) { 
	    Comparator<ListNode> cmp;
        cmp = new Comparator<ListNode>() {  
        @Override
        public int compare(ListNode o1, ListNode o2) {
            // TODO Auto-generated method stub
            return o1.val-o2.val;
        }
        };
 
        Queue<ListNode> q = new PriorityQueue<ListNode>(cmp);
        for(ListNode l : lists){
            if(l!=null){
                q.add(l);
            }        
        }
        ListNode head = new ListNode(0);
        ListNode point = head;
        while(!q.isEmpty()){ 
            point.next = q.poll();
            point = point.next; 
            ListNode next = point.next;
            if(next!=null){
                q.add(next);
            }
        }
        return head.next;
    }
	    public static Nodes copyRandomList(Nodes head) {
	        HashMap<Nodes, Nodes> map = new HashMap<Nodes, Nodes>();

	       Nodes p = head;
	       while(p != null){
	           map.put(p, new Nodes(p.val));
	           p = p.next;
	       }

	       Nodes q = head;
	       while(q != null){
	           map.get(q).next = map.get(q.next);
	           map.get(q).random = map.get(q.random);
	           q = q.next;
	       }
	       
	       //return new head
	       return map.get(head);
	   }
}