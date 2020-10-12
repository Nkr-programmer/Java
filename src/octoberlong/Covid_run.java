package octoberlong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Covid_run {

	public static void main(String[] args) throws  IOException {


long T=0;
	Scanner sc = new Scanner(System.in);
   	if(sc.hasNext())
   	{   T = sc.nextLong();}
 try{
 while(T > 0)
		{
		long n=0,k=0,x=0,y=0;	
		if(sc.hasNext())
 	{   n = sc.nextLong();}
		if(sc.hasNext())
 	{   k = sc.nextLong();}
		if(sc.hasNext())
 	{   x = sc.nextLong();}
		if(sc.hasNext())
 	{   y = sc.nextLong();}
		
	HashMap<Long,Long>a=new HashMap<Long,Long>();
		if(x==y) {System.out.println("YES");T--;continue;}
		if(k==0&&x!=y) {System.out.println("NO");T--;continue;}
		else
			if(k==0&&x==y) {System.out.println("YES");T--;continue;}
			if(k==1){System.out.println("YES");T--;continue;}
		while(x!=y) {
		    
		    
		if(a.containsKey(x)) {System.out.println("NO");break;}
		else
		{a.put(x,(long) 0);}
		x=(x+k)%n;
		}
		if(x==y) {System.out.println("YES");}
		T--;
		}	
			
		}
		catch(Exception e){}		
	}
	}