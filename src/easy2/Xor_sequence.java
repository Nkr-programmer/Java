package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Xor_sequence {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			int     k= Integer.parseInt(st.nextToken());
			int []a=new int[1024];
			st = new StringTokenizer(br.readLine());
			a[k]=1;
	for(int i=0;i<n;i++){
			int t=Integer.parseInt(st.nextToken());
			for(int j=0;j<1024;j++){
				if(a[j]==1) 
				{a[t^j]=1;}
			   }
			}
	int g=1023;
	while(a[g]!=1) {
		{g--;}
	}
System.out.println(g);
	

		T--;
		}
	}
}