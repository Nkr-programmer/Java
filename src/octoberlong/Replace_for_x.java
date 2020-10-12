package octoberlong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
//6 4 4 1
//0 3 3 3 9 4 
//5 5 5 3
//0 1 2 3 3  
          public class Replace_for_x {

	public static void main (String[] args) throws NumberFormatException, IOException 
	{

		long T=0;
		Scanner sc = new Scanner(System.in);
	   	if(sc.hasNext())
	   	{   T = sc.nextLong();}
	 try{
 while(T > 0)
		{
	 long n=0,k=1,x=0,p=1;	
		if(sc.hasNext())
	{   n = sc.nextLong();}
		if(sc.hasNext())
	{   x = sc.nextLong();}
		if(sc.hasNext())
	{   p = sc.nextLong();}
		if(sc.hasNext())
	{   k = sc.nextLong();}
long []a= new long[(int)n]; 
 	   for(int i=0;i<n;i++)
{a[i]=sc.nextLong();}
 	   Arrays.parallelSort(a);
if(p<k) {
	if(a[(int)p-1]<x) {System.out.println(-1);T--;continue;}
	int r=(int)p-1;
//	while(p-1>=r) {b.addFirst(a[r]);r++;}
	int g=0;
	while(r-10000>=0&&a[r-10000]>x) {r=r-10000;g=g+10000;}
	while(r>=0&&a[r]>x) {r--;g++;}
	System.out.println(g);T--;continue;
}
else
	if(p>k) {
		if(a[(int)p-1]>x)  {System.out.println(-1);T--;continue;}
int r=(int)p-1;
//while(p-1<=r) {b.addFirst(a[r]);r--;}
int g=0;
while(r+10000<n&&a[r+10000]<x) {r=r+10000;g=g+10000;}
while(r<n&&a[r]<x) {r++;g++;}
System.out.println(g);T--;continue;
	}
	else
		if(p==k) {
			if(a[(int)p-1]>x) {
			int r=(int)p-1;
			//while(p-1>=r) {b.addFirst(a[r]);r++;}
			int g=0;
			while(r-10000>=0&&a[r-10000]>x) {r=r-10000;g=g+10000;}
			while(r>=0&&a[r]>x) {r--;g++;}
			System.out.println(g);T--;continue;		
			}
			else
				if(a[(int)p-1]<x)  {
			int r=(int)p-1;
		//	while(p-1<=r) {b.addFirst(a[r]);r--;}
			int g=0;
			while(r+10000<n&&a[r+10000]<x) {r=r+10000;g=g+10000;}
			while(r<n&&a[r]<x) {r++;g++;}
			System.out.println(g);T--;continue;}
				else
				{System.out.println(0);}
				
		}

}
T--;}
		catch(Exception e){}		
	}
	}
           class Replace_for_x2 {

        		public static void main (String[] args) throws NumberFormatException, IOException 
        		{

        			long T=0;
        			Scanner sc = new Scanner(System.in);
        		   	if(sc.hasNext())
        		   	{   T = sc.nextLong();}
        		 try{
        	 while(T > 0)
        			{
        		 long n=0,k=1,x=0,p=1;	
        			if(sc.hasNext())
        		{   n = sc.nextLong();}
        			if(sc.hasNext())
        		{   x = sc.nextLong();}
        			if(sc.hasNext())
        		{   p = sc.nextLong();}
        			if(sc.hasNext())
        		{   k = sc.nextLong();}
        	long []a= new long[(int)n]; 
        	 	   for(int i=0;i<n;i++)
        	{a[i]=sc.nextLong();}
        	 	   Arrays.parallelSort(a);
        	if(p<k) {
        		if(a[(int)p-1]<x) {System.out.println(-1);T--;continue;}
        		if(a[(int)p-1]==x) {System.out.println(0);T--;continue;}
        		int r=(int)p-1;
//        		while(p-1>=r) {b.addFirst(a[r]);r++;}
        		int g=0;
        		while(r-10000>=0&&a[r-10000]>x) {r=r-10000;g=g+10000;}
        		while(r>=0&&a[r]>x) {r--;g++;}
        		System.out.println(g);T--;continue;
        	}
        	else
        		if(p>k) {
        			if(a[(int)p-1]>x)  {System.out.println(-1);T--;continue;}
        			if(a[(int)p-1]==x)  {System.out.println(0);T--;continue;}
        	int r=(int)p-1;
        	//while(p-1<=r) {b.addFirst(a[r]);r--;}
        	int g=0;
        	while((r+10000)<n&&a[r+10000]<x) {r=r+10000;g=g+10000;}
        	while(r<n&&a[r]<x) {r++;g++;}
        	System.out.println(g);T--;continue;
        		}
        		else
        			if(p==k) {
        				if(a[(int)p-1]>x) {
        				int r=(int)p-1;
        				//while(p-1>=r) {b.addFirst(a[r]);r++;}
        				int g=0;
        				while(r-10000>=0&&a[r-10000]>x) {r=r-10000;g=g+10000;}
        				while(r>=0&&a[r]>x) {r--;g++;}
        				System.out.println(g);T--;continue;		
        				}
        				else
        					if(a[(int)p-1]<x)  {
        				int r=(int)p-1;
        			//	while(p-1<=r) {b.addFirst(a[r]);r--;}
        				int g=0;
        				while(r+10000<n&&a[r+10000]<x) {r=r+10000;g=g+10000;}
        				while(r<n&&a[r]<x) {r++;g++;}
        				System.out.println(g);T--;continue;}
        					else if(a[(int)p-1]==x)
        					{System.out.println(0);T--;continue;}
        					
        			}

        	}
        	T--;}
        			catch(Exception e){}		
        		}
        		}
//           #include <stdio.h>
//           void swap(long long* xp,long long* yp) 
//           { 
//            long   long  temp = *xp; 
//               *xp = *yp; 
//               *yp = temp; 
//           } 
//             
//           // Function to perform Selection Sort 
//           void quicksort(long long arr[], long long l, long r)
//           {
//               // Base case: No need to sort arrays of length <= 1
//               if (l >= r)
//               {
//                   return;
//               }
//               
//               // Choose pivot to be the last element in the subarray
//               long long pivot = arr[r];
//
//               // Index indicating the "split" between elements smaller than pivot and 
//               // elements greater than pivot
//               long long cnt = l;
//
//               // Traverse through array from l to r
//               for (int i = l; i <= r; i++)
//               {
//                   // If an element less than or equal to the pivot is found...
//                   if (arr[i] <= pivot)
//                   {
//                       // Then swap arr[cnt] and arr[i] so that the smaller element arr[i] 
//                       // is to the left of all elements greater than pivot
//                       swap(&arr[cnt], &arr[i]);
//
//                       // Make sure to increment cnt so we can keep track of what to swap
//                       // arr[i] with
//                       cnt++;
//                   }
//               }
//               
//               // NOTE: cnt is currently at one plus the pivot's index 
//               // (Hence, the cnt-2 when recursively sorting the left side of pivot)
//               quicksort(arr, l, cnt-2); // Recursively sort the left side of pivot
//               quicksort(arr, cnt, r);   // Recursively sort the right side of pivot
//           }
//           int main(void) {
//           	// your code goes here
//           long long T=0;
//           	
//           	   	{  scanf("%lld",&T);}
//           	  while(T > 0)
//           		{
//           long long  n=0,k=1,x=0,p=1;	
//               {   scanf("%lld",&n);}
//               {    scanf("%lld",&x);}
//           	{    scanf("%lld",&p);}
//           	{    scanf("%lld",&k);}
//           long long a[n]; 
//            	   for(int i=0;i<n;i++)
//           {scanf("%lld",&a[i]);}
//            	   quicksort(a,0,n-1); 
//           if(p<k) {
//           	if(a[p-1]<x) {	printf("-1");printf("\n");T--;continue;}
//           	if(a[p-1]==x) {	printf("0");printf("\n");T--;continue;}
//           	int r=p-1;
////           	while(p-1>=r) {b.addFirst(a[r]);r++;}
//           	int g=0;
//           	while((r-10000)>=0&&a[r-10000]>x) {r=r-10000;g=g+10000;}
//           		while((r-1000)>=0&&a[r-1000]>x) {r=r-1000;g=g+1000;}
//           			while((r-100)>=0&&a[r-100]>x) {r=r-100;g=g+100;}
//           	while(r>=0&&a[r]>x) {r--;g++;}
//           		printf("%d",g);printf("\n");T--;continue;
//           }
//           else
//           	if(p>k) {
//           		if(a[p-1]>x)  {	printf("-1");printf("\n");T--;continue;}
//           			if(a[p-1]==x)  {	printf("0");printf("\n");T--;continue;}
//           int r=p-1;
//           //while(p-1<=r) {b.addFirst(a[r]);r--;}
//           int g=0;
//           while((r+10000)<n&&a[r+10000]<x) {r=r+10000;g=g+10000;}
//           while((r+1000)<n&&a[r+1000]<x) {r=r+1000;g=g+1000;}
//           while((r+100)<n&&a[r+100]<x) {r=r+100;g=g+100;}
//           while(r<n&&a[r]<x) {r++;g++;}
//           	printf("%d",g);printf("\n");T--;continue;
//           	}
//           	else
//           		if(p==k) {
//           			if(a[p-1]>x) {
//           			int r=p-1;
//           			//while(p-1>=r) {b.addFirst(a[r]);r++;}
//           			int g=0;
//           			while((r-10000)>=0&&a[r-10000]>x) {r=r-10000;g=g+10000;}
//           			while((r-1000)>=0&&a[r-1000]>x) {r=r-1000;g=g+1000;}
//           			while((r-100)>=0&&a[r-100]>x) {r=r-100;g=g+100;}
//           			while(r>=0&&a[r]>x) {r--;g++;}
//           				printf("%d",g);printf("\n");T--;continue;		
//           			}
//           			else
//           				if(a[p-1]<x)  {
//           			int r=p-1;
//           		//	while(p-1<=r) {b.addFirst(a[r]);r--;}
//           			int g=0;
//           			while((r+10000)<n&&a[r+10000]<x) {r=r+10000;g=g+10000;}
//           				while((r+1000)<n&&a[r+1000]<x) {r=r+1000;g=g+1000;}
//           					while((r+100)<n&&a[r+100]<x) {r=r+100;g=g+100;}
//           			while(r<n&&a[r]<x) {r++;g++;}
//           			printf("%d",g);printf("\n");T--;continue;}
//           				else if(a[p-1]==x) 
//           				{printf("0");printf("\n");T--;continue;}
//           				
//           		}
//           }
//
//           return 0;
//           	}
//           	    