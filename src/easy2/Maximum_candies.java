package easy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Maximum_candies {

	public Maximum_candies() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T > 0)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int		n = Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
int x=Integer.parseInt(st.nextToken());
int y=Integer.parseInt(st.nextToken());
	
//
//if(n*m==1) {System.out.println(x);}
//else
//{
//	
//if(n*m%2==0) {
//	
//	if(2*x>y) {System.out.println((n*m/2)*y);}
//	else {
//		System.out.println(n*m*x);
//	}
//	
//}
//else {
//	int total=0;
//
//	if(x>y) {System.out.println(((n*m+1)/2)*y);}
//	else
//	{
//		if(2*x<=y) {System.out.println(((n*m))*x);}
//		else {
//			
//			total=(((n*m)+1)/2)*x;
//			total=total+(((n*m)/2)*(y-x));
//			System.out.println(total);
//		}
//		
//		
//	}
//}
////7
////5 3 3 6
////5 3 5 6
////5 3 2 7
////5 3 10 4
////4 4 4 6
////3 4 4 5
//
//}
if(n*m==1)System.out.println(x);
else {
    x=Math.min(x,y);
    y=Math.min(2*x,y);
    System.out.println((n*m+1)/2*x+n*m/2*(y-x));
}

		T--;
		}
	}
}