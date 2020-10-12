package linkedListd;


public class MyLinkedList {
	
	  /** Initialize your data structure here. */
	      

    static  class  ListNode{
		int data;
		static ListNode next;
		static ListNode prev;
		ListNode(int d,ListNode tail,ListNode next){
			
			this.data=d;
			this.prev=tail;
			this.next=next;
		}
	}
    static ListNode head;
ListNode tail;
public    MyLinkedList() {
head= new ListNode(-1,null,null);
tail= new ListNode(-1,head,null);
head.next=tail;
     }

static int size=0;
/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
public int get(int index) {
	return getNodeAt(index).data;
}
//1
private ListNode getNodeAt(int i) {
if(head.next == null)
      return null;

ListNode temp = head.next;

  while(i > 0){
      temp = temp.next;
      i--;
  }
  return temp;
}
///////////
public static void printed(){
	
ListNode temp =head ;
while(temp!=null)
{
  System.out.print(temp.data);
  temp=temp.next;
}
System.out.print("\n");
	
}
public void delete(int n) {
	 
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
	 size--;
	 
	 if(temp.next==null)
	 {
		 return ;
	 }
	 
	 prev.next=temp.next;
}
///////////
/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
public void addAtHead(int val) {
	 addBetween(val, head, head.next);
}
//2
private void addBetween(int val, ListNode head2, ListNode next) {
	// TODO Auto-generated method stub
ListNode a=new ListNode(val, head2, next);
head2.next=a;
next.prev=a;
size++;

}

/** Append a node of value val to the last element of the linked list. */
public void addAtTail(int val) {
	addBetween(val, tail.prev, tail);
}

/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
public void addAtIndex(int index, int val) {
	if(index==size) {addBetween(val,tail.prev,tail);}
  else{
ListNode x=getNodeAt(index);
addBetween(val,x.prev,x);}
}

/** Delete the index-th node in the linked list, if the index is valid. */
public void deleteAtIndex(int index) {
	if(inRange(index)) {
ListNode x=getNodeAt(index);
remove(x);       } 
}

//3
public boolean inRange(int index){
  return (index >= 0 && index < size);
}


private void remove(ListNode node){
  ListNode prev = node.prev;
  ListNode next = node.next;

  prev.next = next;
  next.prev = prev;

  size--;
}

}
