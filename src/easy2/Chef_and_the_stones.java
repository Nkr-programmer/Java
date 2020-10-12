package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chef_and_the_stones {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			long		n1 = Long.parseLong(st.nextToken());
			long		n2 = Long.parseLong(st.nextToken());
			long		 m= Long.parseLong(st.nextToken());
			long sum=(m*(m+1))/2;
	
			long min=Math.min(n1, n2);
			if(sum>=min) {
				System.out.println(Math.max(n1, n2)-min);
			}else
			{System.out.println(n1+n2-2*sum);}
		
			}
		
			




	

		T--;
		}
	}
