package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Johny_and_beansstalk {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		outer:while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n1 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int expe=1;
			int []a= new int[n1];
			for(int i=0;i<n1;i++)
			{
				a[i]=Integer.parseInt(st.nextToken());
			}
			for(int i=0;i<n1;i++) {
				if(a[i]>expe) {
					System.out.println("No");T--;continue outer;
				}else
					if(i==n1-1) {
						if(expe!=a[i]) {System.out.println("No");T--;continue outer;}
					}else
				if(a[i]<=expe) {
					expe=(expe-a[i])*2;
				}
			}
			System.out.println("Yes");
			T--;
			}
		
			

		}
	}
