package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Chef_and_streetfood {

	public Chef_and_streetfood() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int s=0,n=0,p=0,v=0,u=0;
	
	    		if(sc.hasNext())
		    	{   n = sc.nextInt();}
	    
	    		int[] k=new int[n];
	    		
	    		for(int i=0;i<n;i++) {
	    		if(sc.hasNext())
		    	{   s = sc.nextInt();}
	    		if(sc.hasNext())
		    	{   p = sc.nextInt();}
	    		
	    		u=p/(s+1);
	    		
	    		if(sc.hasNext())
		    	{   v = sc.nextInt();}
	    		
	    		k[i]=u*v;
	    		}
	    		Arrays.sort(k);
	    		System.out.println();
	    		System.out.print(k[n-1]);
	 t--;

	    	}
	  
	
			}
			catch(Exception e){}
	}

}
