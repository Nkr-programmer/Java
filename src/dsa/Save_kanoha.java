package dsa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Save_kanoha {

	public Save_kanoha() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
			 int t=0;
	    			int count=0,count1=0;
	    			Scanner sc = new Scanner(System.in);
	    		if(sc.hasNext())
		    	{   t = sc.nextInt();}
	    	while(t>0) {
	    		int n=0;
	    		long z=0;
	    		n=sc.nextInt();
	    		z=sc.nextInt();
	    		PriorityQueue<Integer> a=new PriorityQueue<Integer>(Collections.reverseOrder());
	    		for(int y=0;y<n;y++)
	    		{
	    			a.add(sc.nextInt());
	    		}
	    		int r=0;
	    		while(z>0) {
	    			
	    			if(a.peek()==0) {break;}
	    				
	    		z=z-a.peek();
int w=a.remove();
	    	a.add(w/2);
	    	
	    		r++;
	    		}
	    		if(a.peek()==0)
	    			System.out.println("Evacuate");
	    		else
	    		System.out.println(r);
	    		
	    		t--;
	    	}
	
			}
			catch(Exception e){}
		
	}

}
