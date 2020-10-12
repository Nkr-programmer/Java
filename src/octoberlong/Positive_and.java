package octoberlong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Positive_and {

	public static void main (String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int T=0;
   	
   	{   T =  Integer.parseInt(br.readLine());}
 try{
 while(T > 0)
		{
		int n=0;	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
 	{   n = Integer.parseInt(st.nextToken());}
if(n==1) {System.out.println(1);}
else if(n==2) {System.out.println(-1);}
else if(n==3) {System.out.println(1+" "+3+" "+2);}
else if(n==4) {System.out.println(-1);}
else if(n==5) {System.out.println(2+" "+3+" "+1+" "+5+" "+4);}
else  {

	int x=6,t1=4;
		while(t1<n) {t1=t1*2;}
	if(t1==n) {System.out.println(-1);T--;continue;}t1=4;
	System.out.print(2+" "+3+" "+1+" "+5+" "+4);
	while(x<=n)
	{
		if(x>65539) {
			System.out.print(" "+x++);
		}
		else {
		if(x<2*t1)
	{System.out.print(" "+x++);}
		else 
			if(x==2*t1)
			{x++;System.out.print(" "+x+" "+(x-1));x++;
			 t1=t1*2; 
			}
		}
	}
System.out.println();
    
}
	
T--;
		}	
			
		}
		catch(Exception e){}		
	}
	}
//works with c
//int T=0;
//	
//	{   scanf("%d",&T);}
//
//while(T > 0)
//	{
//	int n=0;	
//	
//	{  scanf("%d",&n);}
//if(n==1) {printf("1");printf("\n");}
//else if(n==2) {printf("-1");printf("\n");}
//else if(n==3) {printf("1 3 2");printf("\n");}
//else if(n==4) {printf("-1");printf("\n");}
//else if(n==5) {printf("2 3 1 5 4");printf("\n");}
//else  {
//
//int x=6,t1=4;
//	while(t1<n) {t1=t1*2;}
//if(t1==n) {printf("-1");printf("\n");T--;continue;}t1=4;
//printf("2 3 1 5 4 ");
//while(x<=n)
//{
//	
//	if(x<2*t1)
//{printf("%d ",(x++));}
//	else 
//		if(x==2*t1)
//		{x++;printf("%d %d ",x,(x-1));x++;
//		 t1=t1*2; 
//		}
//	}
//printf("\n");
//
//}
//
//T--;
//	}	
//			
//return 0;
//
//}
