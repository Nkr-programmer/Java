package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Chef_and_easy_problem {

	public Chef_and_easy_problem() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t=0;
		t= sc.nextInt();
		while(t>0) {
			long n=0,q=0,c=1,lo=0;
			n=sc.nextLong();
			
			int[] a=new int[(int)n];
for(int j=0;j<n;j++) {
	a[j]=(int) sc.nextLong();
}		
Arrays.parallelSort(a);
for(int j=(int) (n-1);j>=0;j=j-2) {
	q=q+a[j];
}		


System.out.println(q);
			
			t--;}
			}

		}