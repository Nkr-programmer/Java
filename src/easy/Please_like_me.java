package easy;

import java.util.Scanner;

public class Please_like_me {

	public Please_like_me() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  =new Scanner(System.in);
		
		int t=0;
				t= sc.nextInt();
		while(t>0) {
			
			long l=0,d=0,s=0,c=0;
			l=sc.nextLong();
			d=sc.nextLong();
			s=sc.nextLong();
			c=sc.nextLong();
long h=s;d--;
			while(d>0) {
	h=h+c*h;
					d--;
			}
			
			
			if(h>=l)
			System.out.println("ALIVE AND KICKING");
			else
			{
				System.out.println("DEAD AND ROTTING");
			}
			
			
			
			t--;}
		
		
	}

}
