package juneLong;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chefs_and_icecreams {

	public Chefs_and_icecreams() {
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
	    	boolean check=true;
		    		if(sc.hasNext())
		    	{   n = sc.nextInt();} 
		    		
		    		int[] a= new int[n];
		    		Map<Integer,Integer>b=new HashMap<Integer,Integer>();
		    		for(int i=0;i<n;i++)
		    		{
		    			a[i]=sc.nextInt();
		    		}
		    		for(int i=0;i<n;i++) {
		    			if(i==0) {
		    				if(a[i]==5)k++;
		    				else {check= false;break;}
		    			}
		    			else
		    			{
		    				if(a[i]==5) {
		    					k++;
		    				}
		    				else
		    				if(a[i]==10)
		    				{
		    					total++;
		    				}
		    				if(a[i]==15) {
		    					revenues++;
		    				}
		    			}
		    			
		    					
		    			if(total>k) {
		    				check= false;break;
		    			}
		    	
		    				if(revenues>total+((k-total)/2))
		    					check= false;break;
		    			
		    		}
		    		
		    		
	    	
		    		

		    	
		    		System.out.println();
		    		if(check==false)
		    		System.out.print("NO");
		    		else
		    			System.out.print("Yes");
		    		
		    		t--;

	    	}
	 
			}
			catch(Exception e){}
		
		
	
		
	}

}
