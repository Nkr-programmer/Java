package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Smart_phone {

	public Smart_phone() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
			 int n=0;
	    			long count=0,count1=0;
	    			Scanner sc = new Scanner(System.in);
	    		if(sc.hasNext())
		    	{   n = sc.nextInt();}
	    		long[]a= new long[n];
	    		for(int i=0;i<n;i++)
	    		{
	    			a[i]=sc.nextLong();
	    		}
	           Arrays.sort(a);
	           for(int i=0;i<n;i++)
	    		{
	    			count1=a[i]*(n-i);
	    			
	    			if(count1>count) {
	    				count=count1;
	    			}
	    		}
	           System.out.println(count);
	 
//	 	
//	 3
//	 5 3 4
//	 13 8 1
//	 760399384224 5 1	
	    	
	  
	
			}
			catch(Exception e){}
		
		
	}

}
