package easy;

import java.util.Scanner;

public class The_best_box {

	public The_best_box() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {
			int p=0,sa=0;
			double l=0,v=0;
			p=sc.nextInt();
			sa=sc.nextInt();
			
			l=(p-Math.sqrt(p*p-24*sa))/12;
			v= l*(sa/2-l*(p/4-l));
			
			System.out.println(v);
			System.out.println(String.format("%2f",v));
			//to print in 798.8765432345 to 798.876543 only .2f
			
			//to print in 7.9887654323E5 to 798876543 only 2f
			
			
			
			t--;
		}
				
				
	}

}
