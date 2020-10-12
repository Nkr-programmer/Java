package easy;

import java.util.Scanner;

public class Sum_queries {

	public Sum_queries() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Scanner sc =new Scanner(System.in);
		long n=0;
		long m=0,k=0;
		n=sc.nextLong();
		long g=n;
		m=sc.nextLong();
		n++;
		
		if(g==1) {
			
			k=sc.nextLong();
			if(k==2)
			System.out.println("1");
			else 
				System.out.println("0");
			}
		else {
		while(m>0) {
		k=sc.nextInt();
		long y=0;
		y=k-n;
		if(y>n-1) {
			
			if(k>((2*(n-1))+1)) {
				
				
				long u=k-((2*(n-1))+1);
				long j=y-(2*u);
				if(j>0)
				System.out.println(j);
				else
					System.out.println("0");
			}
			
			
		}
		else {
			if(y>0)
			System.out.println(y);
			else
				System.out.println("0");
		}
			
			m--;
		}
				
				
		
		}
		
		
		
		
		
		
		
		
		
	}

}
