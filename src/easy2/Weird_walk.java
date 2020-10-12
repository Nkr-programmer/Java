package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Weird_walk {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			long a=0,b=0,check=0;
			long as=0,bs=0;
			st = new StringTokenizer(br.readLine());
			long []aa=new long[n];
			long []ba=new long[n];
	for(int i=0;i<n;i++){
		aa[i]= Long.parseLong(st.nextToken());}
	st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
		ba[i]= Long.parseLong(st.nextToken());}
	
		for(int i=0;i<n;i++){
	
		if(as==bs) {
			if(aa[i]==ba[i]) {
		check=check+aa[i];		
			}
		}
		as=as+aa[i];
		bs=bs+ba[i];
			}
System.out.println(check);
	

		T--;
		}
	}
}