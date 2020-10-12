package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Magic_elements {

	public static void main(String[] args) throws  IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int	n = Integer.parseInt(st.nextToken());
			long k = Integer.parseInt(st.nextToken());
			long a=0,b=0,check=0;
			long as=0,bs=0;
			st = new StringTokenizer(br.readLine());
			long []aa=new long[n];
		for(int i=0;i<n;i++){
		aa[i]= Long.parseLong(st.nextToken());
		a=a+aa[i];
		}
		
		for(int i=0;i<n;i++){
			
	if((a-aa[i])<(aa[i]+k)) {b++;}
			}
			
		
		
		
		
System.out.println(b);
	

		T--;
		}
	}
}