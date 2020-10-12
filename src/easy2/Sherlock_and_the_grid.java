package easy2;

import java.util.ArrayList;
import java.util.Scanner;

public class Sherlock_and_the_grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		
		while(t>0) {
			int n= sc.nextInt();
			String []r=new String[n];
			ArrayList<Integer>a=new ArrayList<Integer>();
			for(int i=0;i<n;i++)
			r[i]=sc.next();
			int h=0,l=0,v=0;
			for(int i=n-1;i>=0;i--)
			{
				for(int j=n-1;j>=0;j--)
				{
					if(r[i].charAt(j)=='.') {
					if(a.contains(j)) {}
					else {h++;}
						}
					else if(r[i].charAt(j)=='#') { 
					a.add(j);
						
						break;}
					
				}	
				
			}
			System.out.println(h);
			
			t--;}
		
			}
			

		}