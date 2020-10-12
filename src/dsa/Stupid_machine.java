package dsa;

import java.util.Scanner;

public class Stupid_machine {

	public Stupid_machine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {long n=0,v=0,u=0,x=0;
	    	long m=Long.MAX_VALUE;
	    
	

	    		if(sc.hasNext())
		    	{   n = sc.nextLong();}
	  long[] s= new long[(int) n];
	    		for(int i= 0;i<n;i++)
	    		{
	    			s[i]=sc.nextLong();
	    		
	    		}
	    		
	for(int h=0;h<n;h++)
	{
long d=Math.min(s[h], m);
u+=d;
m=d;

	}
System.out.println(u);
	t--;

	    	}
//	    	1
//	    	6
//	    	8 3 4 2 3 7
	
			}
			catch(Exception e){}
	}

	}


