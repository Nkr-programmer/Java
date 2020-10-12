package codechef;

import java.util.Scanner;

public class Chef_and_num {

	public Chef_and_num() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int t=0;
	Scanner sc	= new Scanner(System.in);
			
	    	
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0)
	    	{
      int n=0,value=0,high=0, a=0,b=0,x=0;
			
      if(sc.hasNext())
				n=sc.nextInt();
			
				int car[]=new int [n];
		
				
				
				for(int i=0;i<n;i++)
				{if(sc.hasNext())
					car[i]=sc.nextInt();
				if(x<car[i])x=car[i];
				}
				
				int bike[]=new int [x+1];
				for(int i=0;i<n;i++)
				{ 
					
					a=car[i];
					
					if(b==a)a=0;
					
					bike[a]++;
					b=a;
				}
				
			    
				
				
				for(int i=1;i<=x;i++) {
				if(value<bike[i]) {value=bike[i];high=i;}	
				}
				System.out.println();
				System.out.print(high);
	    		t--;
	    	}
				
	}
		
catch(Exception e) {}

}
}