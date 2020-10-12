package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class The_army {

	public The_army() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int max = 0;
			int min = 100000;
			st = new StringTokenizer(br.readLine());
			while(M-- > 0)
			{
				int pos = Integer.parseInt(st.nextToken());
			max=Math.max(max, pos);
			min=Math.min(min, pos);
			}

			int u=max;
			for(int i=0;i<N;i++) {
				if((max-min)%2==0) {
					
					if(i>=(max+min)/2) {
						System.out.print(u++ +" ");
					}else
					System.out.print(u-- +" ");
				}
				else {

					if(i>=(((max+min)/2)+1)) {
						System.out.print(u++ +" ");
					}else
						if(i==(max+min)/2)
							System.out.print(u+" ");
						else
					System.out.print(u-- +" ");
					
				}
			}
			
			
			
//			for(int i=0;i<N;i++)
//			{
//				int in=Math.abs(i-min);
//				int fi=Math.abs(i-max);
//				
//				System.out.print(Math.max(in, fi)+" ");
//			}
			System.out.println();
		T--;
		}
	}
}
//2
//100 5
//6 20 30 40 99
//100 5
//5 20 30 40 99