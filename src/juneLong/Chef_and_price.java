package juneLong;

import java.util.Scanner;

public class Chef_and_price {

	public Chef_and_price() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int n=0,k=0,total=0,revenues=0;
		    		if(sc.hasNext())
		    	{   n = sc.nextInt();} 
		    		if(sc.hasNext())
			    	{   k = sc.nextInt();} 
	 
		    		
		    		for(int i=0;i<n;i++)
		    		{
		    			int revenue=sc.nextInt();
		    			revenues+=revenue;
		    			if(revenue>k) {
		    				total+=k;
		    			}
		    			else
		    				if(revenue<=k) {
		    					total+=revenue;
		    				}
		    			
		    			
		    		}
		    		
		    		System.out.println();
		    		System.out.print(revenues-total);
		    		
		    		t--;

	    	}
	 
			}
			catch(Exception e){}
		
		
		
		
		
		
		
		
	}

}
