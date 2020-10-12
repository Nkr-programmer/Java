package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Matrix_decompostion {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub


long co=1000000007;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			long		n = Integer.parseInt(st.nextToken());
			long		a = Integer.parseInt(st.nextToken());
			long sum=0,pi=0;
			if(a==0)System.out.println(0);
			else {
				
				
				for(long i=1;i<=n;i++) {
					pi=first(a,2*i-1);
					a=(a*pi)%co;
					sum=(sum+pi)%co;
				}
				System.out.println(sum%co);
			}
		
			




	

		T--;
		}
	}

	private static long first(long a, long i) {
		// TODO Auto-generated method stub
		long b=1,co=1000000007;
		a=a%co;
		if(a==0)return 0;
	
		
	
		
		while(i>0) {
			if(i
					%2==1) {b=(b*a)%co;}
			a=(a*a)%co;
			i=i>>1;
		}
		
		return b;
	}
    }