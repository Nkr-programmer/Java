package dsa;

import java.util.Scanner;

public class Laddu {

	public Laddu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {String s="";
	    	            int y=0,m=0;
	    	            boolean f=true;
	    	            
	    	            if(sc.hasNext())
	    	            {y=sc.nextInt();}
	    	            if(sc.hasNext())
	    	            s=sc.next();
	    	       
	    	            for(int i=0;i<y;i++)
	    	            {
	    	                
	 	    	           String  k=sc.next();
	    	              
	 	    	           if(k.equals("CONTEST_WON")) {
	    	                	 int l=sc.nextInt();m+=300;
	    	                	if(l<20) {m+=20-l;}
	    	                	
	    	                }
	    	                else
	    	                	  if(k.equals("BUG_FOUND")) 
	    	                {int l=sc.nextInt();
	    	                
	    	                	m+=l;
	    	                }
	    	                	  else
	    	                		  if(k.equals("TOP_CONTRIBUTOR")) {
	    	                			 
	    	                			  m+=300;
	    		    	               
	    		    	                }
	    		    	                else
	    		    	                	  if(k.equals("CONTEST_HOSTED")) 
	    		    	                {
	    		    	                	m+=50;
	    		    	                	
	    		    	                }
	 	    	           
	 	    	           }
	    	                
	    	                
	    	                
//	    	               
//	    	            2
//	    	            4 INDIAN
//	    	            CONTEST_WON 1
//	    	            TOP_CONTRIBUTOR
//	    	            BUG_FOUND 100
//	    	            CONTEST_HOSTED
//	    	            4 NON_INDIAN
//	    	            CONTEST_WON 1
//	    	            TOP_CONTRIBUTOR
//	    	            BUG_FOUND 100
//	    	            CONTEST_HOSTED
		
	    	                System.out.println();
	    	            if(s.equals("INDIAN"))
	    	            {
	    	            	System.out.print(m/200);
	    	            }
	    	            else
	    	            {
	    	            	System.out.print(m/400);
	    	            }
	    	t--;}
	 
			}
			catch(Exception e){}
	}

}
