package dsa;

import java.util.Scanner;

public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int n=0,k=0,j=1,p=0;
		    		if(sc.hasNext())
		    	{   n = sc.nextInt();} 
		    		while(j<n) {
		    		j=j*5;
		    		k+=n/j;}
	 System.out.println(k);
		    		t--;
//		    		6
//		    		3
//		    		60
//		    		100
//		    		1024
//		    		23456
//		    		87353730
	    	}
	 
			}
			catch(Exception e){}
	}

}
