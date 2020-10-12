package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Carvans {

	public Carvans() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int n=0,l=1,f=0,y3=0;
	
	    		if(sc.hasNext())
		    	{   n = sc.nextInt();}
	  int a[]=new int[n];
	    		for(int i=0;i<n;i++) {
	    			a[i]=sc.nextInt();
	    		}

	    		for(int i=0;i<n-1;i++) {
	    			if(a[i+1]>a[i]) {
	    				a[i+1]=a[i];
	    			}else
	    			{
	    				l++;
	    			}
	    		}
	    		System.out.println();
	    			System.out.print(l);
	    		
	    		
	 t--;
//	 3
//	 1
//	 10
//	 3
//	 8 3 6
//	 5
//	 4 5 1 2 3	
	    	}
	  
	
			}
			catch(Exception e){}
		
		
	}

}
