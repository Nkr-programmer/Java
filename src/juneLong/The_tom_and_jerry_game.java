package juneLong;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class The_tom_and_jerry_game {

	public The_tom_and_jerry_game() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {float k=0,total=1,revenues=0;
	    	float ts=0;
	    	boolean check=true;
		    		if(sc.hasNext())
		    	{   ts = sc.nextFloat();} 
		    		float n=ts; 
		    	while(n%2==0) {
		    		n=n/2;
		    		k++;
		    	}
		    	float jsm=2;
		 
		    	for(int i=1;i<k+1;i++) 
		    	{ jsm=jsm*2; }
	    revenues=jsm;
		    	
		    total=ts/revenues;
		    	
		    		
System.out.println();
System.out.print((int)total);
		    		t--;

	    	}
	 
			}
			catch(Exception e){}
		
		
		
	}

}
