package dsa;

import java.util.Scanner;
import java.util.Stack;



public class Compiles_and_parseres {


	public static void brakket(String parent) {
		
		int x=0,i,j=0,k=0,l=0,m=0;
	
		for ( i=0;i<parent.length();i++)
		{
			char c= parent.charAt(i);
			
			if(i==0&&c=='>') {break;}
			
			if(c=='<')
			{
				j++;
			}
			
				if(c=='>')
				{
					if(k<j)
					k++;
					else
						if(j==k) {
				break;
			}
						else {break;}
		}
				
				if(j==k) {
					l=l+2*j;
					j=0;k=0;
				}
				}
			
			
		
		
		
System.out.println();
		
			System.out.print(l);
		
	}

	
		public static void main(String[] args) {
	
			try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {
	    		String parent="";
              parent =sc.next();
		brakket(parent);
	t--;	}
	    	
			
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
