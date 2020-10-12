package codechef;

import java.util.Scanner;

public class Full_barrier_alchemist {

	public Full_barrier_alchemist() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {int n=0,h=0,y1=0,y2=0,l=0,count=0,count1=0;
	   
	    		if(sc.hasNext())
		    	{   n = sc.nextInt();}
	    		if(sc.hasNext())
		    	{   h = sc.nextInt();}
	    		if(sc.hasNext())
		    	{   y1 = sc.nextInt();}
	    		if(sc.hasNext())
		    	{   y2 = sc.nextInt();}
	            if(sc.hasNext())
		    	{   l = sc.nextInt();}
	    	    int[] bar= new int[2];
	    	    h=h-y1;
	    		for(int i=0;i<n;i++) {
	    			bar[0]=sc.nextInt();
	    			bar[1]=sc.nextInt();
	    			
	    			if(l==0){bar[0]=3;}
	    			
if(bar[0]==1) {
	if(bar[1]>=h) {count++;}
	else {
		l--;if(l==0) {
			continue;
		}count++;
		}
}else
	if(bar[0]==2) {
		if(bar[1]<=y2) {count++;}
		else {
			l--;if(l==0) {
				continue;
			}count++;
			}
	}

	    			
	    		}
	    	
	    	
	    	
//	    		3
//	    		6 5 1 2 3
//	    		2 2
//	    		2 1
//	    		1 10
//	    		2 8
//	    		2 4
//	    		1 2
//	    		1 4 2 5 1
//	    		2 6
//	    		6 5 1 2 3
//	    		2 2
//	    		2 1
//	    		1 10
//	    		2 8
//	    		2 4
//	    		1 6
	    	
	 t--;
	 	System.out.println(count);
	    	
	    	}
	  
	
			}
			catch(Exception e){}
				
	}
}
