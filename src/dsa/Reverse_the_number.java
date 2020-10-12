package dsa;

import java.util.Scanner;

public class Reverse_the_number {

	public Reverse_the_number() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int n=0,k=0,j=0,p=0;
		    		if(sc.hasNext())
		    	{   n = sc.nextInt();}
		  System.out.println();  
		  while(j==0) {
		  j=n%10;
		  if(j==0)
			  n=n/10;}
while(n!=0) {		    		
	k=n%10;
System.out.print(k);
n=n/10;
}
	  
	 t--;

	    	}
	 
			}
			catch(Exception e){}
	}

}
