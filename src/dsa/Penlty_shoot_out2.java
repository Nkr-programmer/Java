package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Penlty_shoot_out2 {

	public Penlty_shoot_out2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int n=0,v=0,u=0,x=0,m=0;
	    	String y=""; 
	
	    		if(sc.hasNext())
		    	{   n = sc.nextInt();}
	    	        y = sc.next();
		   while(v!=y.length())
		   {
			 if(y.charAt(v++)=='1')u++;
			 if(y.charAt(v++)=='1')x++;
		   }
	
	    		System.out.println(u+" "+x);
	    	if(u>x)
	    	{int a=0,b=n,k=0;
	    		while(a<=b) {
	    			 if(y.charAt(k)=='1') {a++;m++;}
	    			 else {m++;}
	    			 k++;
	    			if(a>b) {break;}
	    			
	    			if(y.charAt(k)=='0') { b--;m++;}
	    			 else {m++;}
	    			k++;
	    		}
	    	}
	    	else
	    		if(u<x) {
	    			int a=n,b=0,k=0;
	    			while(a>=b)
	    			{
	    				
	    				 if(y.charAt(k)=='0') {a--;m++;}
		    			 else {m++;}
		    		k++;
		    		
		    			if(a<b) {break;}
		    			
		    			if(y.charAt(k)=='1') { b++;m++;}
		    			 else  {m++;}
		    			k++;
		    
	    			}
	    		}
	    	
	    	if(u==x) {m=2*n;}
	    		System.out.println();
	    	System.out.print(m);	
	 t--;

	    	}
//	    	1
//	    	6
//	    	011111110100
	
			}
			catch(Exception e){}
	}

}
