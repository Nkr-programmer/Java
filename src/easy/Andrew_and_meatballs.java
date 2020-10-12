package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Andrew_and_meatballs {

	public Andrew_and_meatballs() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {long x1=0,y1=0,ch=0;
	long x=sc.nextLong();
	long y= sc.nextLong();

	long [] a=new long[(int)x];
	for(int i=0;i<x;i++) {
		a[i]=sc.nextLong();
		ch=ch+a[i];
	}
	
	if(ch<y) {System.out.println("-1");t--;continue;}

	
	
	Arrays.parallelSort(a);
	while(x1<y) {
		x1=x1+a[(int)x-1];y1++;
		
		x--;
	}
	if(ch<y)System.out.println("-1");
	else
	System.out.println(y1);
		t--;
}
	}
	}