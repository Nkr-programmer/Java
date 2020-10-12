package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class The_morning_commute {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			
		 int g=0;
			while(n-->0) { st = new StringTokenizer(br.readLine());
			int		x = Integer.parseInt(st.nextToken());
			int		l = Integer.parseInt(st.nextToken());
			int		f = Integer.parseInt(st.nextToken());
			g=Math.max(g, x);
			g+=(f-(g-x)%f)%f+l;
			}
		
			


	System.out.println(g);

	

		T--;
		}
	}
    }