package juneLong;

import java.util.Scanner;

public class Guessing_game {


		
			public static void main(String[] args) {

			
			
			try{
				 int  t=0;
				
		    	Scanner sc = new Scanner(System.in);
		    	if(sc.hasNext())
		    	{   t = sc.nextInt();}
		    	
		    	int maxzeroes=-1,minzeroes=0,t1=t;
		    	while(t1>=1) { maxzeroes++;
		    		t1=t1/10;
                    
		    	}
		  
		    	
		    	int min=1,max=t;
		        boolean lie= false;
		    	System.out.println("1");
		    	
		    	char comp=sc.next().charAt(0);
		    	max=t;
		    	t=min;
		    	if(comp=='H') {
		    	lie=false;	
		    	}
		    	else
		    		if(comp=='L') {
				    	lie=true;	
				    	}
		    	
		    	
	 	while(comp!='E') {
		    		if(lie) {
		    			
		    			
		    			if(maxzeroes-minzeroes>1) {
		    				t=numbercreater((maxzeroes+minzeroes)/2);
		    			System.out.println(t);
		    			 comp=sc.next().charAt(0);
		    			 if(comp=='H') {
		 				    min=t;
		 				    minzeroes=(maxzeroes+minzeroes)/2;
		 				    
		 				    lie=false;
		 				    	}
		 				    	else
		 				    		if(comp=='L') {
		 						    	max=t;
		 						    	maxzeroes=(maxzeroes+minzeroes)/2;
		 						    	
		 						    	lie=false;
		 						    	}
		    			 
		    			 
		    			 
		    			}
		    			
		    			else {
		    		t=(min+max)/2;
		    		System.out.println(t);
		    		 comp=sc.next().charAt(0);
		    		if(comp=='H') {
				    min=t;
				    
				    lie=false;
				    	}
				    	else
				    		if(comp=='L') {
						    	max=t;
						    	
						    	lie=false;
						    	}
				    	
		    			}
		    			
		    		}else
		    		if(!lie) {
		    		if(t==max) {
		    			t--;max--;
		    			System.out.println(t);
		    			 comp=sc.next().charAt(0);
		    			if(comp=='H') {
		    		    	lie=true;	
		    		    	}
		    		    	else
		    		    		if(comp=='L') {
		    				    	lie=false;	
		    				    	}
		    		    	
		    		}else
		    			if(t==min) {
		    				t++;
		    				min++;
		    				System.out.println(t);
		    				 comp=sc.next().charAt(0);
		    				if(comp=='H') {
		    			    	lie=false;	
		    			    	}
		    			    	else
		    			    		if(comp=='L') {
		    					    	lie=true;	
		    					    	}
		    			    	
		    			}
		    		
		    		}

		    	
		    	
		    	}
			    
		   
			    			
			    		}
			    		

		    	
		 
				
				catch(Exception e){}
			
			
		
			
		}

			private static int numbercreater(int zeroes) {
				// TODO Auto-generated method stub
				int g=1;
				while(zeroes!=0)
				{
					g=g*10;
					zeroes--;
				
				}
				return g;
			}

		
		}
	


