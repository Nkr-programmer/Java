package juneLong;

import java.util.Scanner;

public class Chef_and_string {

	public Chef_and_string() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int k=0,total=0,revenues=0;
	    	String n="";
	    	boolean check=false;
		    		if(sc.hasNext())
		    	{   n = sc.next();} 
		    
		    		
		    		if(n.charAt(0)=='x') {
		    			check=true;
		    		}
		    		
		    		
	 
		    		for(int i=0;i<n.length();i++)
		    		{
		    			
		    			if(revenues<total) {
		    				revenues=total;
		    				if(n.charAt(i)=='x') {
				    			check=true;
				    		}else
				    		{
				    			check=false;
				    		}
		    			}
		    			
		    			
		    			if(n.charAt(i)=='x') {
		    				if(check==true) {
		    					check=false;
		    			
		    					
		    					k++;
		    				}
		    			}
		    			else
		    				if(n.charAt(i)=='y')
		    				{
		    					if(check==false) {
		    						check=true;
		    						k++;
		    					}
		    				}
		    			
		    			if(k%2==0) {
		    				total++;
		    			}
		    		}
		    		
		    		System.out.println();
		    		System.out.print(k/2);
		    		
		    		

		    		
		    		t--;

	    	}
	 
			}
			catch(Exception e){}
		
		
		
		
		
		
		
		
		
	}

}
