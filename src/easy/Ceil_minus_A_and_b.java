package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Ceil_minus_A_and_b {

	public Ceil_minus_A_and_b() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Scanner sc = new Scanner(System.in);
		
			long n=0,k=0;
			long l=0,m=0;

			n=sc.nextLong();
			k=sc.nextLong();
		  l=n-k;
			m=l%10;
			if(m==9) {
				l--;
			}
			else {l++;}
			
			System.out.println(l);
			
		
		
	}


}

