package septemberLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A_problem_on_sticks {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			 st = new StringTokenizer(br.readLine());
			 int []a=new int[n];
			 for(int i=0;i<n;i++) {
			int n1 = Integer.parseInt(st.nextToken());
			a[i]=n1;
			 }
			 Arrays.sort(a);
			 int j=0;
			 for(int i=1;i<=n;i++)
			 {
			if(a[n-i]==a[n-1]) {continue;}
			else {
			a[n-1]=a[n-i];	
			j++;
			 }
			 }
			 if(a[0]>0)
			 System.out.println(j+1);
			 else
				 System.out.println(j);
		T--;
		}
	}
	}