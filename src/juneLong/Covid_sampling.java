package juneLong;

import java.util.Scanner;

public class Covid_sampling {

	public Covid_sampling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		try{
			 int  t=0;
			
	    	Scanner sc = new Scanner(System.in);
	    	if(sc.hasNext())
	    	{   t = sc.nextInt();}
	    	while(t>0) {
	    		int n=0,p=0;
	    		if(sc.hasNext())
		    	{   n = sc.nextInt();}	
	    		
	    		if(sc.hasNext())
		    	{   p = sc.nextInt();}
	    		
	    		int[][] infect= new int[n][n];
	    		int i=1,j=1;
	    		while(i<=n)
	    		{
	    		
	    	regulate(i,j,n,infect,sc);
	    	i++;	
	    	}
	    		System.out.println("2");
	    		int y=0,z=0;
	    		while(y<n) {
	    	dou(y,z,infect,n);
	    	System.out.println();
	    		y++;
	    		}
	    		
	    		int u=-1;
	    		 u=sc.nextInt();
	    		if(u==-1) {
	    			break;
	    		}
		    		t--;

	    	}
	 
			}
			catch(Exception e){}
		
		
	}

	private static void dou(int i,int j,int infect[][],int n) {
		// TODO Auto-generated method stub
		
		if(j>=n) {
			return ;
		}
		
		System.out.print(infect[i][j]+" ");
		j++;
		dou(i,j,infect,n);
	}

	private static void regulate(int i,int j,int n,int infect[][], Scanner sc) {
		// TODO Auto-generated method stub
		
		if(j>n) {
			return ;
		}
		
		
		System.out.println("1 "+i+" "+j+" "+i+" "+(j+n-1));
		int ki=0;
		ki=sc.nextInt();
		
		
		
		while(ki>0) {
			
		if(ki==n) {
			while(j<n) {
			infect[i-1][j-1]=1;
			
		}
			break;
			}
			
			
			
		System.out.println("1 "+i+" "+j+" "+i+" "+j);
		int k=0;
		k=sc.nextInt();
		infect[i-1][j-1]=k;
		j++;
		if(k==1)
		ki--;
		
		
		
		}
//		j=n+1;
//		regulate(i,j,n,infect,sc);
//	}
//	private static void regulate(int i,int j,int n,int infect[][], Scanner sc) {
//		// TODO Auto-generated method stub
//		
//		if(j>n) {
//			return ;
//		}
//		
//		
//		System.out.println("1 "+i+" "+j+" "+i+" "+(j+n-1));
//		int ki=0;
//		ki=sc.nextInt();
//		
//		int ro=0;
//		
//		while(ki>0) {
//			
//		if(ki==n) {
//			while(j<n) {
//			infect[i-1][j-1]=1;
//			j++;
//			
//		}
//			break;
//			}
//			
//			
//			
//		System.out.println("1 "+i+"1 "+i+" "+j);
//		int k=0;
//		k=sc.nextInt();
//		if(k-ro==1)
//		infect[i-1][j-1]=k-ro;
//		j++;
//		
//		
//		
//		if(k-ro==1)
//		ki--;
//		
//		ro=k;
//		
//		}
//		j=n+1;
//		regulate(i,j,n,infect,sc);
}
}

	
	


