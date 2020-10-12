package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Subtract_game_1 {

	public Subtract_game_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {
	int n=0,k=0,m=0;
    n= sc.nextInt();
	int  aa=0;
	int [] ad=new int[n];
			 
for(int i=0;i<n;i++) {
	ad[i]= sc.nextInt();
}

m=ad[0];
for(int i=1;i<n;i++) {
	m=gcd(m,ad[i]);
}

System.out.println(m);
		System.out.println();
	
	
			t--;
		}
				
				
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		
		if(b==0)return a;
		return gcd(b,a%b);
	}

}


