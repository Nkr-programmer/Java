package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Chef_and_stones {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {
		long n=0,q=1,k=0,c=0,lo=-1;
		n=sc.nextLong();
		k=sc.nextLong();
		long[] a=new long[(int)n];
	for(int j=0;j<n;j++) {
 c=sc.nextLong();
 a[j]= (k/c);
	}
	
	for(int j=0;j<n;j++) {
		 c=sc.nextLong();
	a[j]= (a[j]*c);	 
	}
Arrays.parallelSort(a);

System.out.println(a[(int) (n-1)]);

	t--;
}
	}
	
	}