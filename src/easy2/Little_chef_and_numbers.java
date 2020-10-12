package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Little_chef_and_numbers {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			long r=0,r1=0;
			st = new StringTokenizer(br.readLine());
	for(int i=0;i<n;i++){
			long t=Long.parseLong(st.nextToken());
			if(t==2) {r1++;}
			if(t==0||t==1) {r++;}
			}
	long o= n-r;
	System.out.println((o*(o-1))/2-(r1*(r1-1))/2);
		

	

		T--;
		}
	}
}