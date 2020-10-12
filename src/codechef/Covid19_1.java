package codechef;

import java.util.Scanner;

public class Covid19_1 {

	
		// TODO Auto-generated constructor stub
		
		public static void main(String[] args) {
		

		  int t;
		   
	    	Scanner sc = new Scanner(System.in);
		    t = sc.nextInt();
		    
		 while(t>0){
				 
				int n,low=100000,high=1, c=1;
			
				
				n=sc.nextInt();
			
				int car[]=new int [n];
		
				
				for(int i=0;i<n;i++)
				{
					car[i]=sc.nextInt();
					
			    }
				
			    
				
				for(int i=0;i<n;i++)
				{
					if(i!=n-1) {
					if(car[i+1]-car[i]<=2)
					{
						c++;
					}
					else
						if(car[i+1]-car[i]>2)
					{
												
						if(high<=c)
						{high=c;}
						if(low>=c)
						{low=c;}
							
						
						
						c=1;
					}
						 
//						if(low==high&&high==1)
//						{	low=c;
//						high=c;}
//						else
//						if(c<low&&c!=1) {low=c;}
//						else
//							if(c>high) {high=c;}
			
					
						 
					}
					else {	if(high<=c)
					{high=c;}
					if(low>=c)
					{low=c;}
						
					
					
					c=1;}
				//	System.out.println(c+" "+high+" "+low);
				}
				
				
			
				 System.out.println();
				System.out.println(low+"  "+high);
				 
					t--;
				}
				
			
			  
		 
		
		
		
	}
		
		
		
	}


