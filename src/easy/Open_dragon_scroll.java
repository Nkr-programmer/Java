package easy;

import java.util.Scanner;

public class Open_dragon_scroll {

	public Open_dragon_scroll() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  =new Scanner(System.in);
		
		int t=0;
				t= sc.nextInt();
		while(t>0) {
			int a1=0,b1=0,sum=0;
		int a=0,b=0,n=0;
		n=sc.nextInt();
			a=sc.nextInt();
			b=sc.nextInt();
			while(a>0) {//first find minimum(a's 1and b's 0)+minimum(b's 1and a's 0)
				if(a%2!=0)a1++;//for of 2power find to n
				a=a/2;
			}
			System.out.println(a1);
			while(b>0) {
				if(b%2!=0)b1++;//no.s of 0s
				b=b/2;
			}
			System.out.println(b1);
			int d=Math.abs( n-(a1+b1));
			for(int i=d;i<n;i++) {
				
				sum=sum+(int)Math.pow(2, i);
			}
			System.out.println(sum);
			
	//imp   	Integer.bitCount(11);
			t--;}
		
		
	}

}
