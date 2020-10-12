package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Suraj_goes_shopping {

	public Suraj_goes_shopping() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc =new Scanner(System.in);
		int t=0;
		t= sc.nextInt();
		while(t>0) {
			int n=0,q=0,c=1,lo=0;
			n=sc.nextInt();
			int []a=new int[n];
			for(int i=0;i<n;i++)
			{a[i]=sc.nextInt();}
				Arrays.parallelSort(a);
for(int j=n-1;j>=0;j--) {
	if(c%4==3||c%4==0) {}
	else {
		lo=lo+a[j];
	}
c++;
}			
System.out.println(lo);
			
			t--;}
			}

		}
