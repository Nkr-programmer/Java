package juneLong;

import java.util.Scanner;

public class Even_matrix {

	public Even_matrix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int n=0,k=0,total=1,revenues=0;
	    
		    		if(sc.hasNext())
		    	{   n = sc.nextInt();} 
		    
		    	System.out.println();
		    	boolean uor=true;
		    		for(int i=1;i<=n;i++)
		    		{
		    			for(int j=1;j<=n;j++) 
		    			{	
		    				
		    				System.out.print(total+" ");
		    				
		    				if(uor==true)
		    				{total++;	}
		    				else
		    				if(uor==false)
		    				{
		    					total--;
		    				}
		    		}
		    			
		    			if(uor==true) {total=total+n-1;uor=false;}
		    			else
		    				if(uor==false) {total=total+n+1;uor=true;}
		    			System.out.println();
		    			}
		    		t--;	
		    		}
		    		

	    	
	 
			}
			catch(Exception e){}
		
		
	
		
	}

}
