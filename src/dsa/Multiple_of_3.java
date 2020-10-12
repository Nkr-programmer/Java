package dsa;

import java.util.Scanner;

public class Multiple_of_3 {

	public Multiple_of_3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {long n=0,l=0,f=0,y3=0;
	    			int y1=0,y2=0;
	    			long count=0,count1=0,i=0;
	  
	    		if(sc.hasNext())
		    	{   n = sc.nextLong();}
	    		if(sc.hasNext())
		    	{   y1 = sc.nextInt();}
	    		if(sc.hasNext())
		    	{   y2 = sc.nextInt();}
	            System.out.print(y1+""+y2);
	    		count=y1*10+y2;
	    		
	    		
	    		
	    		 i=y1+y2;
	    		 
	    		 
	    		 
	    		 
	    		 {
	    		for(long u=2;u<n;u++)
	    		{
	    			count1+=y1+y2;
	    			long y=count1;
	    		if(count1>=10)count1=count1%10;
	    		y1=0;y2=0;y3++;
	    		 i+=count1;
if(count1==8) {break;}
if(count1==0) {break;}
	    		count1=count1+y%10;
	    	
	    		}
	    		
	    		if(count1==8) {
	    		l=(n-y3-2)/4;
	    		f=(n-y3-2)%4;
	    		if(f==1)
	    		i=i+l*20+6;
	    		else
	    		if(f==2)
		    		i=i+l*20+8;
	    		else
	    		if(f==3)
		    		i=i+l*20+12;
	    		else
	    			if(f==0)
		    		i=i+l*20+0;
	    		}
	    	
	    	}
	    		System.out.println();
System.out.println(i);
	    	if(i%3==0)System.out.print("YES");
	    	else
	    		System.out.println("NO");
	    		
	    		
	 t--;
//	 	
//	 3
//	 5 3 4
//	 13 8 1
//	 760399384224 5 1	
	    	}
	  
	
			}
			catch(Exception e){}
	}

}
