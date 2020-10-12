package easy;

import java.util.Scanner;

public class Subarray_gcd {

	public Subarray_gcd() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {
		int n=0,q=1,c=0,lo=-1;
		n=sc.nextInt();
		int[] a=new int[n];
	for(int j=0;j<n;j++) {
 a[j] =sc.nextInt();
 }
	int y=0;
	for(int i=0;i<n;i++) {
		
			y= gcd(y,a[i]);
	}
	
	if(y==1)
	System.out.println(n);
else
	System.out.println("-1");
	t--;
}
	}
	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
if(b==0)return a;
		
		return gcd(b,a%b);
		
	}		

	}