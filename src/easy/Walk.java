package easy;

import java.util.Scanner;

public class Walk {

	public Walk() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t=0;
	
		t=sc.nextInt();
		while(t>0) {
		long n=0,m=0,k=0,v=0;
		n=sc.nextLong();
		long nt=n;
		long j=0,h=0,l=0;
		while(n>0) {
		m=sc.nextLong();
	     k=m;v=n;
	     k=k+nt-v;
		if(h<k) {h=k;}
		
		n--;}
			
			
			if(h>=nt)System.out.println(h);
			else System.out.println(nt);

	
		t--;
		}
		
		
		
		
		
		
		
		
	}

}
