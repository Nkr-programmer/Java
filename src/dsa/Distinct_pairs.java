package dsa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Distinct_pairs {

	public Distinct_pairs() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		try{
			 int t=0;
	    		
	    			//Scanner sc = new Scanner(System.in);
	    		
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				StringTokenizer st=new StringTokenizer(br.readLine());
			
			 
			 
	    		int n=0;
	    		int z=0;
	    		 n=Integer.parseInt(st.nextToken());
				 z=Integer.parseInt(st.nextToken());
	    	int [] x= new int[n];
	    	int [] u=new int[z];
	    	 st=new StringTokenizer(br.readLine());
			
	    		for(int y=0;y<n;y++)
	    		{
	            x[y]=Integer.parseInt(st.nextToken());
	    		}
	    		 st=new StringTokenizer(br.readLine());
	    		for(int y=0;y<z;y++)
	    		{
	    			u[y]=Integer.parseInt(st.nextToken());
	    			
	    		}
	    		Set<Integer>q=new HashSet<>();
	    		int c=0,count=0,d=0;
	    		for(int r=0;r<n;r++)
	    		{
	    			
	    			while(c!=z) {
	    			if(!q.contains(x[r]+u[c]))
	    			{	q.add(x[r]+u[c]);
	    			System.out.println(r+" "+c);count++;
	    			if(count==n+z-1) {d=1;break;}
	    			}
	    			c++;
	    			}c=0;
	    			if(d==1) {
	    				break;
	    			}
	    		}
	    	
	
			}
			catch(Exception e){}
	}
}