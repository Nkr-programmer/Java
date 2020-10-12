package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Approximately {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int	n = Integer.parseInt(st.nextToken());
			StringBuilder s=new StringBuilder();
			int y=103993;
			int q=33102;
for(int i=0;i<n+1;i++) {
	if(i==1)
s.append(".");
	s.append(y/q);
y=y%q;
y=y*10;
	
}System.out.println(s.toString());

		T--;
		}
	}
}