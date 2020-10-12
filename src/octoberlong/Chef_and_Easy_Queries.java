package octoberlong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chef_and_Easy_Queries {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	long T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			long	n = Integer.parseInt(st.nextToken());
			long		k = Integer.parseInt(st.nextToken());
			boolean x= false;
			 st = new StringTokenizer(br.readLine());
			 long []a=new long[(int)n];
			 for(int i=0;i<n;i++) {
			int n1 = Integer.parseInt(st.nextToken());
			a[i]=n1-k;
			if(i!=0) {
			a[i]=a[i-1]+a[i];
			if(a[i]<0&&x==false) {System.out.println(i+1);x=true;}
			}
			else
			{
				if(a[i]<0&&x==false) {System.out.println(i+1);x=true;}
			}
			 }
			 if(x==false) {long g=a.length+1+(long)(a[a.length-1]/k);
			 System.out.println(g);}
		T--;
		}
	}
	}