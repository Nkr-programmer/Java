package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Row_and_column_operations {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int []r=new int[n];
int []c=new int[n];
		int t= sc.nextInt();
		int xt=0,yt=0;
		while(t>0) {
			
			String se=sc.next();
			int rc =sc.nextInt();
int x= sc.nextInt();
			if(se.equals("RowAdd")) {r[rc-1]=r[rc-1]+x;
			if(xt<r[rc-1]) {xt=r[rc-1];}
			}
			else
				 if(se.equals("ColAdd"))
			{c[rc-1]=c[rc-1]+x;
			if(yt<c[rc-1]) {yt=c[rc-1];}
			}
			
			t--;}
		
		System.out.println(xt+yt);
		
			}
			

		}