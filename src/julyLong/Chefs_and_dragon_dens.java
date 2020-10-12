package julyLong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Chefs_and_dragon_dens {

	public Chefs_and_dragon_dens() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try{
			 
			
			   InputReader inp = new InputReader(System.in);
		   OutputWriter out = new OutputWriter(System.out);
			int n=0,k=0,x=0,ammo=0,inti=0,dest=0,checker=0,totalammo=0,last=0;
			n=inp.readInt();
			k=inp.readInt();
			
			ArrayList<Integer> y=new ArrayList<Integer>();
			ArrayList<Integer> work=new ArrayList<Integer>();
			
			
			for(int i=0;i<n;i++) {
				
		y.add(inp.readInt());
			}

			for(int i=0;i<n;i++) {
		work.add(inp.readInt());	
			}

		while(k>0) {
			
			int t=inp.readInt();
			if(t==1) {
				
				x=inp.readInt()-1;
				ammo=inp.readInt();
				work.remove(x);
				work.add(x, ammo);
				
			}
			else
				if(t==2){totalammo=0;
					dest=inp.readInt()-1;	
                	inti=inp.readInt()-1;
   		int pivot=0;
   		
   		
   		if(dest<inti) {pivot=inti;
   		for(int i=pivot;i>=dest;i--) 
   		{
   			
   			if(y.get(i)>y.get(dest)) {checker=-1;}
   			else {
   				if(i==pivot) {
   					totalammo=totalammo+work.get(i);
   					last=i;
   				}else
   				if(i<pivot) {
   					if(y.get(i)>y.get(last)) {
   						totalammo=totalammo+work.get(i);	
   						last=i;
   					}else {}
   				}
   			}
   			
   			
   		}
   		
   			
   		
   		}
   		else
   		if(dest>inti){
   			pivot=inti;
   				for(int i=pivot;i<=dest;i++) 
   		{
   			if(y.get(i)>y.get(dest)) {checker=-1;}
   			else {
   				if(i==pivot) {
   					totalammo=totalammo+work.get(i);
   					last=i;
   				}else
   				if(i>pivot) {
   					if(y.get(i)>y.get(last)) {
   						totalammo=totalammo+work.get(i);	
   						last=i;
   					}else {}
   				}
   			}
   		}
   		}
   		else
   		{
   			totalammo=totalammo+work.get(inti);
   		}
   			
			System.out.println();
			if(checker==-1) {
				out.print("-1");
			}else
			System.out.print(totalammo);
   				
				}
			

			k--;
		}
				
//					5 4
//		3 1 4 1 5
//		1 2 4 8 16
//		2 5 2
//		1 3 5
//		2 3 4
//		2 1 4

//		22
//		13
//		-1				

		
			}
			catch(Exception e){}

			
				
				
				
			}
			
			
	

		}


