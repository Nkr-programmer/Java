package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Fit_to_play {

	public Fit_to_play() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc =new Scanner(System.in);
		int t=0;
		t=sc.nextInt();
		while(t>0) {
		int n=0,q=1,k=0,c=0,lo=-1;
		n=sc.nextInt();
		int[] a=new int[n];
		int min=0;
	for(int j=0;j<n;j++) {
 a[j]=sc.nextInt();
	}
	int maxDiff=0;
	min=a[0];
	for(int i=1;i<n;i++) {
		min = Math.min(min, a[i]);
		maxDiff = Math.max(maxDiff, a[i] - min);
	}
	
	
	
if(maxDiff==0) {
	System.out.println("UNFIT");
}else
System.out.println(maxDiff);

	t--;
}
	}
	
	}