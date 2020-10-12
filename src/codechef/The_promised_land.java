package codechef;

import java.util.Scanner;

public class The_promised_land {

	public The_promised_land() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t-->0) {int n=0,m=0,x=0,y=0,s=0,count=0,count1=0;
	   
	    		if(sc.hasNext())
		    	{   n = sc.nextInt();}
	    		if(sc.hasNext())
		    	{   m = sc.nextInt();}
	    		if(sc.hasNext())
		    	{   x = sc.nextInt();}
	    		
	    		  int[] x1=new int[x]; 
	    		  int[] x2=new int[x+1]; 
	    		
	    		if(sc.hasNext())
		    	{   y = sc.nextInt();}
	    		
	    		  int[] y1=new int[y]; 
	    		  int[] y2=new int[y+1]; 
	    		
	    		  if(sc.hasNext())
		    	{   s = sc.nextInt();}
	    	
	    		for(int i=0;i<x;i++) {
	    			x1[i]=sc.nextInt();
	    		}
	    		for(int i=0;i<y;i++) {
	    			y1[i]=sc.nextInt();
	    		}
//2
//7 8
//1 2 2
//5 
//4 8
//6 5
//2 0 1
//1 4
//	    		
//	    		int a=0,b=0;
//	    		boolean check=false;
//	    		
//	    		int[][] area = new int[n][m];
//	    		for(int i=0;i<n;i++) {
//	    			b=0;check= false;
//	    			for(int j=0;j<m;j++) {
//	    				
//		    			if((x>0&&a<x&&x1[a]==i+1)) {
//		    				area[i][j]=1;
//		    				check=true;
//		    				
//		    			}else
//		    				check=false;
//		    			if((y>0&&b<y&&y1[b]==j+1)) {
//		    				area[i][j]=1;
//		    				b++;
//		    			}
//		    				
//		    		}	
//	    			
//	    		
//	    			if(check==true)a++;
//	    		}
//	    		
//	    		System.out.println();
//	    		
//		    		for(int i=0;i<n;i++) {
//		    			
//		    		
//		    		for(int j=0;j<m;j++) {
//		    			System.out.print(area[i][j]);
//		    		}
//		    		System.out.println();
//		    		}
//		    		
//		
	    		
	    		if(x>0)
	    		x2[x]=(n-x1[x-1]);
	    		else
	    			x2[x]=n;
	    		if(y>0)
	    		y2[y]=(m-y1[y-1]);
	    		else
	    			y2[y]=m;
	    	int bi=0;
	    	
	    	for(int i=0;i<x;i++) {
	    		int k=x1[i]-1;
	    		if(i!=0) {
	    		 bi=k-x1[i-1];
	    		 
	    		 x2[i]=bi;
	    	
	    		}
	    		
	    	}if(x>0)x2[0]=x1[0]-1;
	    	
	    	
	    	bi=0;
	    	for(int i=0;i<y;i++) {
	    		int k=y1[i]-1;
	    		if(i!=0) {
	    		 bi=k-y1[i-1];
	    		 
	    		 y2[i]=bi;
	
	    		}
	    	}   if(y>0)
	    		y2[0]=y1[0]-1;
	    		
	    	
	    
        	System.out.println();
            for(int p=0;p<=x;p++)
    		count+=x2[p]/s;
            System.out.println();
            for(int p=0;p<=y;p++)
	    		count1+=y2[p]/s;
    		
		    		
		    		System.out.println(count*count1);
	    	}
	  
	
			}
			catch(Exception e){}
					
			
				
			
				
		
		
	}






}
