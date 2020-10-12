package easy;

import java.util.Scanner;

public class Splitting_candies {

	public Splitting_candies() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

	    int t=0;
		t=sc.nextInt();
		while(t>0) {
			long n=0,total=0,m=0;
		
			n=sc.nextLong();
		m= sc.nextLong();

		
			
		System.out.println();
		System.out.print(n/m +" "+n%m);

			t--;
		}
		

	}


}

