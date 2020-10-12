package julyLong;

import java.util.Scanner;

public class Chef_and_card_game {

	public Chef_and_card_game() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {long n=0,k=0,l=0,k1=0,l1=0,total=0,revenues=0,grand=0;
	    	
	    	n = sc.nextLong();
	    	for(int i=0;i<n;i++)
	    	{
	    		k = sc.nextLong();
	    		l=sc.nextLong();
	    		
	    	k=	summer(k);
	    	l=summer(l);
	  
	    	if(k>l) {
	    		k1++;
	    	}else
	    	if(l>k) {
	    		l1++;
	    	}else
	    		if(l==k){
	    		k1++;
	    		l1++;
	    	}
	    	
	    		
	    	}
	    	
	    	
	    	System.out.println();
	    	if(k1>l1)
	    	System.out.print("0 "+k1);
	    	else
	    		if(l1>k1)
	    			System.out.println("1 "+l1);
	    		else
	    			if(l1==k1)
	    				System.out.println("2 "+l1);
	    	t--;}
			}
			catch(Exception e){}
		
		
		
		
		
		
		
	}

	private static long summer(long k) {long total=0,grand=0;
			while(k>=1) {
	    			total=k%10;
	    			k=k/10;
	    			grand=grand+total;
	    			
	    		}// TODO Auto-generated method stub
			return grand;
		
	}

}
