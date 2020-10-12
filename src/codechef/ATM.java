package codechef;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ATM {

	public ATM() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			 double t=0,  u = 0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextDouble();}
	    	if(sc.hasNext())
	    	{  u=sc.nextDouble();}
	    
		if((t>0&&u>0)&&(t<=u-0.50)){
		    if(t%5==0)
		   if(t<=u){
		    {
		    	 u=u-t;
		    	u-=0.50;
		    }}}

				 
				 System.out.println(u);
				
			}
			catch(Exception e){}
					
			
				
			
				
				}
				
			
	

}
