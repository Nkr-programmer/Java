package dsa;

import java.util.Scanner;

public class Coin_flip {

	public Coin_flip() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int g=0;
	
	    		if(sc.hasNext())
		    	{   g = sc.nextInt();}
	    		while(g>0) {
	    			int i=0,n=0,q=0;
	    			i=sc.nextInt();
	    			n=sc.nextInt();
	    			q=sc.nextInt();
	    			if(n%2==0)
	    				System.out.println(n/2);
	    			else
	    			{
	    				if(i==q)System.out.println(n/2);
	    				else
	    					System.out.println((n/2)+1);
	    			}
	    			
	    			g--;
	    			}


	    		
	    		
	 t--;
//	 1
//	 2
//	 1 5 1
//	 1 5 2
	    	}
	  
	
			}
			catch(Exception e){}
		
		
	}

}
