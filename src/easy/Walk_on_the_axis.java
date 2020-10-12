package easy;

import java.util.Scanner;

public class Walk_on_the_axis {

	public Walk_on_the_axis() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  =new Scanner(System.in);
		
		int t=0;
				t= sc.nextInt();
		while(t>0) {
			
			long y=0;
			y=sc.nextLong();
			
			long r= ((y*(y+1))/2)+y;
				
			System.out.println(r);
			
			
			
			t--;}
		
		
	}

}
