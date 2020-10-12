package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Three_different_numbers {

	public Three_different_numbers() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			long [] a=new long[3];
			a[0] = Long.parseLong(st.nextToken());
a[1]=Long.parseLong(st.nextToken());
a[2]=Long.parseLong(st.nextToken());
			long modu = 1000000007;
	
Arrays.parallelSort(a);
System.out.println(  ( ((a[0]%modu)*((a[1]-1)%modu)%modu)*((a[2]-2)%modu)%modu)
		
		);

		T--;
		}
	}
}