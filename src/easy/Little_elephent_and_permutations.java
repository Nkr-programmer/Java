package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Little_elephent_and_permutations {

	public Little_elephent_and_permutations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		
		Scanner sc = new Scanner(System.in);

	    int t=0;
		t=sc.nextInt();
		while(t>0) {
			int n=0,m=0,b=0;
			int total=0,nac=0;
				n=sc.nextInt();
				int [] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	
	}
     
     
     
	for(int i=0;i<n-1;i++) {
		if(a[i]>a[i+1]) {
			m++;
		}
	}
	
		
	for(int i=0;i<n;i++) {
	total=a[i];
	for(int j=i;j<n;j++) {
		if(total>a[j]) {
			nac++;
		}
	}
	}
	if(nac==m)
	System.out.println("YES");
	else
		System.out.println("NO");
	
			t--;
		}
		


		
	}

}