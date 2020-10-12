package julyLong;

import java.util.Scanner;

public class Chef_and_strings {

	public Chef_and_strings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {long n=0,k=0,total=0,revenues=0,grand=0;
	    	
	    	n = sc.nextLong();
	    	for(int i=0;i<n;i++)
	    	{
	    		k = sc.nextLong();
	    		if(i>0)
	    		{
	    			revenues=k-total;
	    			if(revenues<0) {
	    				revenues=revenues*-1;
	    			}
	    			revenues=revenues-1;
	    			grand=grand+revenues;
	    			total=k;
	    		}
	    		else
	    		{
	    			total=k;
	    		}
	    		
	    	}
	    	System.out.println();
	    	System.out.print(grand);
	    	t--;}
			}
			catch(Exception e){}
		
		
		
		
		
		
		
		
	}

}
