package easy;

import java.util.Scanner;

public class Prime_generater {

	public Prime_generater() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);

	    int t=0;
		t=sc.nextInt();
		while(t>0) {
			int n=0,m=0,b=0;
			int total=0;
				n=sc.nextInt();
				m=sc.nextInt();
				if(n==1) {n=2;}
	for(int i=n;i<=m;i++) {
		total= (int) Math.sqrt(i);
		b=1;
			for(int j=2;j<=total;j++) {
				if(i%j==0) {b=0;break;}
				}
			if(b!=0) {
				System.out.println(i);
			}
	}

	

			t--;
		}
		


		
	}

}
