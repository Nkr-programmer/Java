package septemberLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Corona_spread_2 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		try {
			int T=0;
			Scanner sc	= new Scanner(System.in);
					
			    	
			    	if(sc.hasNext())
			    	{   T = sc.nextInt();}
		while(T > 0)
		{
		int n=0;
			if(sc.hasNext())
			n =sc.nextInt();
			 int []a=new int[n];
			 int []a1=new int[n];
			 for(int i=0;i<n;i++) {
				 if(sc.hasNext())
			a[i]=sc.nextInt();
			 }
int [][]mat =new int[n][n];

for(int i=0;i<n;i++)
{
	a1[i]=check(a,i);	
}
Arrays.parallelSort(a1);
System.out.println(a1[0]+"  "+a1[n-1]);
		T--;
		}
		}
		
		catch(Exception e) {}
	}
	//right
    private static int check(int[] a, int i) {
		// TODO Auto-generated method stub
    	int c=1,c1=1;
 int a1=0,a2=a.length-1;

 while(a2!=i) {
	 if(a[a2]<a[i]) {c++;}
 a2--;}
 while(a1!=i) {
	 if(a[a1]>a[i]) {c++;}
a1++; }

 return c;
	}
    //wrong
	private static int check(int[][] mat, int k) {
		// TODO Auto-generated method stub
    	boolean []a= new boolean[mat[0].length];
    	a[k]=true;
    	for(int i=1;i<a.length;i++)
    	{
    		for(int j=0;j<a.length;j++)
        	{
    		
    			if(j==k) {continue;}
        		if(mat[k][i]<=mat[j][i])
        		{
        			a[j]=true;
        			a=recurse(a,mat,i,j,k);
        		}
        		else {}
        	}	
    	
    	}int g=0;
    	for(int i=0;i<a.length;i++)
    	{if(a[i])
    		{g++;}
    	}
		return g;
	}
	//wrong
	private static boolean[] recurse(boolean[] a, int[][] mat, int l, int k,int z) {
		// TODO Auto-generated method stub
		
		
		for(int i=l+1;i<a.length;i++)
    	{
    		for(int j=0;j<a.length;j++)
        	{
    		
    			if(j==k||j==z) {continue;}
        		if(mat[k][i]<=mat[j][i])
        		{
        			a[j]=true;
//        			for(int d=0;d<a.length;d++)
//        	    	{
//        	    		{System.out.print(a[i]+" ");}
//        	    	}	
        			a=recurse(a,mat,i,j,z);
        		}
        		else {}
        	}	
    	
    	}
		
		
		
		return a;
	}
	//wrong
	static void printMat(int mat[][], int n) 
    { 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) 
                System.out.print(mat[i][j] + " "); 
            System.out.println(); 
        } 
    }  
//wrong 
	private static int[][] find(int[][] mat, int[] a) {
		// TODO Auto-generated method stub
		int t=0;
		for(int i=0;i<a.length;i++) {t=0;
			for(int j=0;j<a.length;j++) {
				mat[i][j]=(i+1)+a[i]*t;
			t++;
			}	
		}
		
		
		return mat;
	}
	
	}
//53412 45
//54310 55
//4132 34
//231 23