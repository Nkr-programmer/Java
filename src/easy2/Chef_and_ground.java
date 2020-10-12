package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chef_and_ground {

	public Chef_and_ground() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
          st = new StringTokenizer(br.readLine());
int tt=0,b=0,v=0;
int []a=new int[n];
			for(int i=0;i<n;i++)
		{
	tt=Integer.parseInt(st.nextToken());
	a[i]=tt;
		}	
Arrays.parallelSort(a);
tt=a[n-1];
for(int i=n-1;i>=0;i--) {
	b=b+(tt-a[i]);
}


if(b==m)
{System.out.println("Yes");}
else{System.out.println("No");}
T--;
		}
	}
}

//3
//5 7
//3 3 4 2 1
//5 6
//3 3 4 2 1
//5 8
//3 3 4 2 1

