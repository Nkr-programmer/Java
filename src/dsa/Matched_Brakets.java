package dsa;

import java.util.Scanner;
import java.util.Stack;

public class Matched_Brakets {

	public static void brakket(int[] parent) {
		
		int x=0,i,j=0,k=0,l=0,m=0,n=0,o=0,p=0;	
		
	char c=0;

	Stack<Character> s= new Stack<Character>();
		for ( i=0;i<parent.length;i++)
		{
			
			if(parent[i]==1) {
			 c= '(';
			}else
				if(parent[i]==2)
				{
					 c= ')';
				}
			if(i==0&&c==')') {break;}
			
			if(c=='(')
			{
				s.push(c);m++;
			}
			
				if(c==')')
				{
					if(k<j)
					{s.pop();n++;}
					else
						if(j==k) {
				break;
			}
						else {break;}
		}
				
			if(s.size()>j) {
				l=i+1;
			
				j=s.size();
			}
			
			if(m==n)
			{
				if(2*m>o) {p=i+1;
			
					o=m*2;
					p=p-o+1;
					
				}m=0;n=0;
			}
				}
			
			
		
		
		
System.out.println();
		
			System.out.print(j+" "+l+" "+o+" "+p);
		
	}

	
		public static void main(String[] args) {
	
			try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	
	    		int[] parent=new int[t];
	    		for(int i=0;i<t;i++) {
              parent[i] =sc.nextInt();
	    		}
	    		
	  	    		
		brakket(parent);
	
	    	
			
//	    	11
//	    	<<>>
//	    	><
//	    	<>>>
//	    	<<>>
//<>
//<><>
//	    	>>
//><><
//<><<>
//	    	<<<<>>>
//	    	<><>>><><>
			    	}

					catch(Exception e){}
	}
	}
